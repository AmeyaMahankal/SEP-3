namespace Domain.Models;

public class Review
{

    public int Id { get; set; }
    public string Comment { get; set; }
    public int StarReview { get; set; }
    public int UserId { get; set; }
    public int CategoryId { get; set; }
    public string CategoryName { get; set; }
    public string CategoryType { get; set; }

    public Review(string comment, int starReview, int userId, int categoryId, string categoryName, string categoryType)
    {
        Comment = comment;
        StarReview = starReview;
        UserId = userId;
        CategoryId = categoryId;
        CategoryName = categoryName;
        CategoryType = categoryType;
    }
}