using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

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

    public Task<Review?> GetByIdAsync(int dtoReviewId)
    {
        Review? existing = context.Reviews.FirstOrDefault(u => u.Id == dtoReviewId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(Review updated)
    {
        Review? existing = context.Reviews.FirstOrDefault(Review => Review.Id == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Review with id {updated.Id} does not exist!");
        }

        context.Reviews.Remove(existing);
        context.Reviews.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
    }
    
    
    public Task DeleteAsync(int id)
    {
        Review? existing = context.Reviews.FirstOrDefault(post => post.Id == id);
        if (existing==null)
        {
            throw new Exception($"Report with id {id} does not exist!");
        }
        
        context.Reviews.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
    
}