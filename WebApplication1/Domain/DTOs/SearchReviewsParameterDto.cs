namespace Domain.DTOs;

public class SearchReviewParameterDto
{

    public int? ReviewContainsCategoryId { get;}
    public string? ReviewContainsCategoryName { get;}
    public string? ReviewContainsCategoryType { get;}

    public SearchReviewParameterDto( int? reviewContainsCategoryId, string? reviewContainsCategoryName, string? reviewContainsCategoryType)
    {
        ReviewContainsCategoryId = reviewContainsCategoryId;
        ReviewContainsCategoryName = reviewContainsCategoryName;
        ReviewContainsCategoryType = reviewContainsCategoryType;
    }
    
    
    
    
}