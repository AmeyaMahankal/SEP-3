namespace Domain.DTOs;

public class ReportCreationDto
{
    public string Description { get;  }
    public int ReviewID { get;  }
    public int OwnerId { get;  }


    public ReportCreationDto(string description, int reviewId, int ownerId)
    {
        Description = description;
        ReviewID = reviewId;
        OwnerId = ownerId;
    }
}