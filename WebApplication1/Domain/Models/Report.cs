namespace Domain.Models;

public class Report
{
    public int Id { get; set; }
    public int UserId { get; set; }
    public string Description { get; set; }
    public int ReviewId { get; set; }

    public Report(int userId, string description, int reviewId)
    {
        UserId = userId;
        Description = description;
        ReviewId = reviewId;
    }
}