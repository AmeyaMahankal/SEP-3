namespace Domain.DTOs;

public class ReviewCreationDto
{
    public string CreateComment { get;}
    public int CreateStarReview { get;}
    public int UserId { get;  }
    public int CategoryId { get;}


    public ReviewCreationDto(string createComment, int createStarReview, int userId, int categoryId)
    {
        CreateComment = createComment;
        CreateStarReview = createStarReview;
        UserId = userId;
        CategoryId = categoryId;

    }
}