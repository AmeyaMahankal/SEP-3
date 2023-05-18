using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class HotelsReviewLogic : IHotelsReviewLogic
{
    private readonly IHotelsReviewDao _hotelsReviewDao;
  

    public HotelsReviewLogic(IHotelsReviewDao hotelsReviewDao)
    {
        this._hotelsReviewDao = hotelsReviewDao;
       
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
        };
        Review created = await _hotelsReviewDao.CreateAsync(review);
        return created;
    }
    public Task<IEnumerable<Review>> GetByCategory(SearchReviewParameterDto searchReviewParameterDto)
    {
        return _hotelsReviewDao.GetAsync(searchReviewParameterDto);
    }

    public async Task UpdateReviewCommentAsync(ReviewUpdateCommentDto commentDto)
    {
        Review? existing = await _hotelsReviewDao.GetByIdAsync(commentDto.ReviewsId);
        if (existing == null)
        {
            throw new Exception($"Review with ID {commentDto.ReviewsId} not found!");
        }
        Review? review = null;
        if (commentDto.ReviewsId != null)
        {
            review = await _hotelsReviewDao.GetByIdAsync((int)commentDto.ReviewsId);
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
        await _hotelsReviewDao.UpdateReviewCommentAsync(updated);
    }

    public async Task UpdateReviewStarReviewAsync(ReviewUpdateStarReviewDto starReviewDto)
    {
        Review? existing = await _hotelsReviewDao.GetByIdAsync(starReviewDto.ReviewsId);
        if (existing == null)
        {
            throw new Exception($"Review with ID {starReviewDto.ReviewsId} not found!");
        }
        Review? review = null;
        if (starReviewDto.ReviewsId != null)
        {
            review = await _hotelsReviewDao.GetByIdAsync(starReviewDto.ReviewsId);
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
        await _hotelsReviewDao.UpdateReviewStarReviewAsync(updated);
    }

    public async Task DeleteAsync(int id)
    {
        Review? report = await _hotelsReviewDao.GetByIdAsync(id);
        if (report == null)
        {
            throw new Exception($"Review with ID {id} was not found!");
        }

        await _hotelsReviewDao.DeleteAsync(id);
    }


    //add some filtering
    private static void ValidateData(ReviewCreationDto reviewCreation)
    {
        string review = reviewCreation.CreateComment;
    }
}