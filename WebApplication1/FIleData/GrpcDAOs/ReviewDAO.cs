using Application.DaoInterfaces;
using DataAccessClient;
using Domain.DTOs;
using Grpc.Net.Client;
using Review = Domain.Models.Review;

namespace FileData.GrpcDAOs;

public class ReviewDAO: IReviewDao
{

    private Access.AccessClient client;

    public ReviewDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    public Task<Review> CreateAsync(Review review)
    {
        ReviewToCreate request = new ReviewToCreate()
        {
            Categoryid = review.CategoryId,
            Categoryname = review.CategoryName,
            Categorytype = review.CategoryType,
            Comment = review.Comment,
            Starreview = review.StarReview,
            Userid = review.UserId
        };

        var send = client.CreateReview(request);

        return Task.FromResult(review);
    }

    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto)
    {
        throw new NotImplementedException();
    }

    public Task<Review?> GetByIdAsync(int dtoReviewId)
    {
        throw new NotImplementedException();
    }

    public Task UpdateAsync(Review updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        throw new NotImplementedException();
    }
}