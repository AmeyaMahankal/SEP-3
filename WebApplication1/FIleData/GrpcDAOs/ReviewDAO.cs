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
        SearchReviewPeremetars search = new SearchReviewPeremetars()
        {
 
            Categoryid = (int) searchReviewParameterDto.ReviewContainsCategoryId,
            Categoryname = searchReviewParameterDto.ReviewContainsCategoryName,
            Categorytype = searchReviewParameterDto.ReviewContainsCategoryType
        };

        var send = client.GetReviewsContainingAsync(search);

        List<Review> listofreviews = new List<Review>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Reviews)
        {
            Review review = new Review()
            {
               Id = VARIABLE.Id,
               Comment=VARIABLE.Comment,
               StarReview = VARIABLE.Starreview,
               UserId = VARIABLE.Userid,
              CategoryId = VARIABLE.Categoryid, 
               CategoryName = VARIABLE.Categoryname,
               CategoryType = VARIABLE.Categorytype 
            };
            listofreviews.Add(review);
        }
        IEnumerable<Review> ilistreviews = listofreviews;
        return Task.FromResult(ilistreviews);
    }

    public Task<Review?> GetByIdAsync(int dtoReviewId)
    {
        ReviewById  request = new ReviewById()
        {
            Id = dtoReviewId
        };

        var send = client.GetReviewById(request);
        Review review = new Review()
        {
         Id = send.Id, 
         Comment = send.Comment, 
        StarReview = send.Starreview,
        UserId = send.Userid,
           CategoryId = send.Categoryid,
           CategoryName = send.Categoryname,
           CategoryType = send.Categorytype
        };
        return Task.FromResult(review);
    }

    public Task<Review?> GetByCategory(int dtoCategoryId, string dtoCategoryName, string dtoCategoryType)
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