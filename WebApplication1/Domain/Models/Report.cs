namespace Domain.Models;

public class Report
{
    public int Id { get; set; }
    public string Description { get; set; }
    public int ReviewID { get; set; }
    public Review ReportedReview { get; set; }

    public Report(string description, int reviewId, Review reportedReview)
    {
        Description = description;
        ReviewID = reviewId;
        ReportedReview = reportedReview;
    }

}