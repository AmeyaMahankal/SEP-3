using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Models;
using Shared.DTOs;

namespace Application.Logic;

public class ReviewLogic:IReviewLogic
{
    private readonly IReviewDao reviewDao;

    public ReviewLogic(IReviewDao reviewDao)
    {
        this.reviewDao = reviewDao;
    }

    public async Task<Review> CreateAsync(ReviewCreationDto dto)
    {
        
        ValidateData(dto);
        Review toCreate = new Review
        {
            Comment = dto.CreateComment
            , StarReview = dto.CreateStarReview

        };

        Review created = await reviewDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto)
    {
        return reviewDao.GetAsync(searchReviewParameterDto);
    }


    //add some filtering
    private static void ValidateData(ReviewCreationDto reviewCreation)
    {
        string review = reviewCreation.CreateComment;
        
    }
    
    
}