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

   /* public Task<Review> GetAsync(SearchReviewByIdDto searchReviewByIdDto)
    {
        return ReviewDao.GetAsync(searchReviewByIdDto);
    }
*/
    public Task<IEnumerable<Review>> GetByCategory(SearchReviewParameterDto searchReviewParameterDto)
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

        
        string commentToUse = dto.ReviewsComment ?? existing.Comment;
        string starReviewToUse = IntToString(dto.ReviewsStarReview) ?? IntToString(existing.StarReview);
        Review updated = new();
        {
            updated.Comment = commentToUse;
            updated.StarReview = StringToInt(starReviewToUse);
            updated.Id = existing.Id;
            updated.UserId = existing.UserId;
            updated.CategoryId = existing.CategoryId;
            updated.CategoryName = existing.CategoryName;
            updated.CategoryType = existing.CategoryType;
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