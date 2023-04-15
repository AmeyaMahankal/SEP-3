using Application.DAOInterfaces;
using Domain.Models;
using Shared.DTOs;

namespace FileData.DAOs;

public class ReviewFileDao:IReviewDao
{
    
    private readonly FileContext context;

    public ReviewFileDao(FileContext context)
    {
        this.context = context;
    }


    public Task<Review> CreateAsync(Review review)
    {
        int reviewId = 1;
        if (context.Reviews.Any())
        {
            reviewId = context.Reviews.Max(u => u.Id);
            reviewId++;
        }

        review.Id = reviewId;
        
        context.Reviews.Add(review);
        context.SaveChanges();

        return Task.FromResult(review);
    }

    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto)
    {
        IEnumerable<Review> reviews = context.Reviews.AsEnumerable();
        if (searchReviewParameterDto.ReviewContainsId != null)
        {
            reviews = context.Reviews.Where(u => u.Id.Equals(searchReviewParameterDto.ReviewContainsId));
        }

        return Task.FromResult(reviews);
    }


}