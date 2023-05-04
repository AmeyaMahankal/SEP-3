namespace Domain.Models;

public class Review
{

    public int Id { get; set; }
    public User Reviewer { get; set; }
    public string Comment { get; set; }
    public int StarReview { get; set; }

    public Review(User reviewer, string comment, int starReview)
    {
        Reviewer = reviewer;
        Comment = comment;
        StarReview = starReview;
    }
}