namespace Domain.DTOs;

public class SearchReviewParameterDto
{

    public int? ReviewContainsCategoryId { get;}

    public SearchReviewParameterDto( int? reviewContainsCategoryId)
    {
        ReviewContainsCategoryId = reviewContainsCategoryId;

    }
    
    
    
    
}