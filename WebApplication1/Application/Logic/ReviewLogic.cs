using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ReviewLogic : IReviewLogic
{
    private readonly IReviewDao ReviewDao;
    private readonly IUserDao UserDao;

    public ReviewLogic(IReviewDao reviewDao, IUserDao userDao)
    {
        this.ReviewDao = reviewDao;
        this.UserDao = userDao;
    }


    public String IntToString(int id)
    {
        String intString;
        intString = id.ToString();
        return intString;
    }

    public int StringToInt(String stringId)
    {
        int stringInt;
        stringInt = Convert.ToInt32(stringId);
        return stringInt;
    }


    public async Task<Review> CreateAsync(ReviewCreationDto dto)
    {
        User? user = await UserDao.GetByIdAsync(dto.OwnerId);
        if (user == null)
        {
            throw new Exception($"User with id {dto.OwnerId} was not found.");
        }


        Review review = new Review(user, dto.CreateComment, dto.CreateStarReview);
        Review created = await ReviewDao.CreateAsync(review);
        return created;
    }

    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto)
    {
        return ReviewDao.GetAsync(searchReviewParameterDto);
    }


    public async Task UpdateAsync(ReviewUpdateDto dto)
    {
        Review? existing = await ReviewDao.GetByIdAsync(dto.ReviewsId);
        if (existing == null)
        {
            throw new Exception($"Review with ID {dto.ReviewsId} not found!");
        }

        Review? review = null;
        if (dto.ReviewsId != null)
        {
            review = await ReviewDao.GetByIdAsync((int)dto.ReviewsId);
            if (review == null)
            {
                throw new Exception($"Review with id {dto.ReviewsId} was not found.");
            }
        }

        User? user = null;
        if (dto.OwnerId != null)
        {
            user = await UserDao.GetByIdAsync((int)dto.OwnerId);
            if (user == null)
            {
                throw new Exception($"User with id {dto.OwnerId} was not found.");
            }
        }


        User userToUse = user ?? existing.Reviewer;
        string descToUse = dto.ReviewsComment ?? existing.Comment;
        string starReviewToUse = IntToString(dto.ReviewsStarReview) ?? IntToString(existing.StarReview);
        Review updated = new(userToUse, descToUse, StringToInt(starReviewToUse));
        {
            updated.Comment = descToUse;
            updated.StarReview = StringToInt(starReviewToUse);
            updated.Id = existing.Id;
        }
        await ReviewDao.UpdateAsync(updated);
    }

    public async Task DeleteAsync(int id)
    {
        Review? report = await ReviewDao.GetByIdAsync(id);
        if (report == null)
        {
            throw new Exception($"Review with ID {id} was not found!");
        }

        await ReviewDao.DeleteAsync(id);
    }


    //add some filtering
    private static void ValidateData(ReviewCreationDto reviewCreation)
    {
        string review = reviewCreation.CreateComment;
    }
}