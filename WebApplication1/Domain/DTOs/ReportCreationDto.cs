namespace Domain.DTOs;

public class ReportCreationDto
{
    public string Description { get;  }
    public int ReviewID { get;  }
  

    public ReportCreationDto(string description, int reviewId)
    {
        Description = description;
        ReviewID = reviewId;
     
    }
}