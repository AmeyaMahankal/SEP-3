using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ReviewLogic : IReviewLogic
{
    private readonly IReviewDao ReviewDao;
  

    public ReviewLogic(IReviewDao reviewDao)
    {
        this.ReviewDao = reviewDao;
       
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
        Review review = new Review()
        { 
           Comment = dto.CreateComment,
          StarReview = dto.CreateStarReview,
          UserId = dto.UserId, 
          CategoryId = dto.CategoryId, 
         CategoryName = dto.CategoryName, 
        CategoryType = dto.CategoryType
        };
        Review created = await ReviewDao.CreateAsync(review);
        return created;
    }
    public Task<IEnumerable<Review>> GetByCategory(SearchReviewParameterDto searchReviewParameterDto)
    {
        return ReviewDao.GetAsync(searchReviewParameterDto);
    }

    public async Task UpdateReviewCommentAsync(ReviewUpdateCommentDto commentDto)
    {
        Review? existing = await ReviewDao.GetByIdAsync(commentDto.ReviewsId);
        if (existing == null)
        {
            throw new Exception($"Review with ID {commentDto.ReviewsId} not found!");
        }
        Review? review = null;
        if (commentDto.ReviewsId != null)
        {
            review = await ReviewDao.GetByIdAsync((int)commentDto.ReviewsId);
            if (review == null)
            {
                throw new Exception($"Review with id {commentDto.ReviewsId} was not found.");
            }
        }
        string commentToUse = commentDto.ReviewsComment ?? existing.Comment;
        Review updated = new();
        {
            updated.Comment = commentToUse;
            updated.Id = existing.Id;
        }
        await ReviewDao.UpdateReviewCommentAsync(updated);
    }

    public async Task UpdateReviewStarReviewAsync(ReviewUpdateStarReviewDto starReviewDto)
    {
        Review? existing = await ReviewDao.GetByIdAsync(starReviewDto.ReviewsId);
        if (existing == null)
        {
            throw new Exception($"Review with ID {starReviewDto.ReviewsId} not found!");
        }
        Review? review = null;
        if (starReviewDto.ReviewsId != null)
        {
            review = await ReviewDao.GetByIdAsync(starReviewDto.ReviewsId);
            if (review == null)
            {
                throw new Exception($"Review with id {starReviewDto.ReviewsId} was not found.");
            }
        }
        string starReviewToUse = IntToString(starReviewDto.ReviewsStarReview) ?? IntToString(existing.StarReview);
        Review updated = new();
        {
            updated.StarReview = StringToInt(starReviewToUse) ;
            updated.Id = existing.Id;
        }
        await ReviewDao.UpdateReviewStarReviewAsync(updated);
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