using Application.DaoInterfaces;
using DataAccessClient;
using Domain.DTOs;
using Grpc.Net.Client;
using Review = Domain.Models.Review;

namespace FileData.GrpcDAOs;

public class ParksReviewDao: IParksReviewDao
{

    private Access.AccessClient client;

    public ParksReviewDao()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    public Task<Review> CreateAsync(Review review)
    {
        ReviewToCreate request = new ReviewToCreate()
        {
            Categoryid = review.CategoryId,
            Comment = review.Comment,
            Starreview = review.StarReview,
            Userid = review.UserId
        };

        var send = client.CreateParksReviewAsync(request);

        return Task.FromResult(review);
    }
    public Task<Review?> GetByIdAsync(int dtoReviewId)
    {
        ReviewById  request = new ReviewById()
        {
            Id = dtoReviewId
        };

        var send = client.GetParksReviewByIdAsync(request);
        Review review = new Review()
        {
            Id = send.ResponseAsync.Result.Id, 
            Comment = send.ResponseAsync.Result.Comment,
            StarReview = send.ResponseAsync.Result.Starreview,
            UserId = send.ResponseAsync.Result.Userid,
            CategoryId = send.ResponseAsync.Result.Categoryid
        };
        return Task.FromResult(review);
    }
    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto)
    {
        SearchReviewPeremetars search = new SearchReviewPeremetars()
        {
 
            Categoryid = (int) searchReviewParameterDto.ReviewContainsCategoryId,

        };

        var send = client.GetParksReviewsContainingAsync(search);

        List<Review> listofreviews = new List<Review>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Reviews)
        {
            Review review = new Review()
            {
               Id = VARIABLE.Id,
               Comment=VARIABLE.Comment,
               StarReview = VARIABLE.Starreview,
               UserId = VARIABLE.Userid,
              CategoryId = VARIABLE.Categoryid 
            };
            listofreviews.Add(review);
        }
        IEnumerable<Review> ilistreviews = listofreviews;
        return Task.FromResult(ilistreviews);
    }

   



    public Task UpdateReviewCommentAsync(Review updated)
    {
        ReviewsCommentToUpdate request = new ReviewsCommentToUpdate()
        {
            Comment = updated.Comment,
            Id = updated.Id
        };
        var send = client.UpdateParksReviewCommentAsync(request);

        Review review = new Review()
        {
            Comment = send.ResponseAsync.Result.Comment
        };
        return Task.FromResult(review);
    }

    public Task UpdateReviewStarReviewAsync(Review updated)
    {
        ReviewStarReviewToUpdate request = new ReviewStarReviewToUpdate()
        {
            Starreview = updated.StarReview,
            Id = updated.Id
        };
        var send = client.UpdateParksStarReviewAsync(request);

        Review review = new Review()
        {
            StarReview = send.ResponseAsync.Result.Starreview
        };
        return Task.FromResult(review);
    }

    public Task DeleteAsync(int id)
    {
        ReviewToDelete request = new ReviewToDelete()
        {
           Id = id
        };

        var send = client.DeleteParksReviewAsync(request);

        return Task.CompletedTask;
    }
}