using Domain.Models;

namespace Shared.DTOs;

public class ReportCreationDto
{
    public string Description { get;  }
    public int ReviewID { get;  }
    public Review ReportedReview { get;  }

    public ReportCreationDto(string description, int reviewId, Review reportedReview)
    {
        Description = description;
        ReviewID = reviewId;
        ReportedReview = reportedReview;
    }
}