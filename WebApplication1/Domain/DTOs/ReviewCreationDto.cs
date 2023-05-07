namespace Domain.DTOs;

public class ReviewCreationDto
{
    public string CreateComment { get;}
    public int CreateStarReview { get;}
    public int UserId { get;  }
    public int CategoryId { get;}
    public string CategoryName { get;}
    public string CategoryType { get;}

    public ReviewCreationDto(string createComment, int createStarReview, int userId, int categoryId, string categoryName, string categoryType)
    {
        CreateComment = createComment;
        CreateStarReview = createStarReview;
        UserId = userId;
        CategoryId = categoryId;
        CategoryName = categoryName;
        CategoryType = categoryType;
    }
}