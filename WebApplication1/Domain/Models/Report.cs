namespace Domain.Models;

public class Report
{
    public int Id { get; set; }
    public User Reviewer { get; set; }
    public string Description { get; set; }
    public Review ReportedReview { get; set; }

    public Report(User reviewer, string description, Review reportedReview)
    {
        Reviewer = reviewer;
        Description = description;
        ReportedReview = reportedReview;
    }
}