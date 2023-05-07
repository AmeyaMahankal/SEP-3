namespace Domain.DTOs;

public class ReportCreationDto
{
    public string Description { get;  }
    public int ReviewID { get;  }
    public int UserId { get;  }


    public ReportCreationDto(string description, int reviewId, int userId)
    {
        Description = description;
        ReviewID = reviewId;
        UserId = userId;
    }
}