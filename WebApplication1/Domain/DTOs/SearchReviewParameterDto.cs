namespace Shared.DTOs;

public class SearchReviewParameterDto
{
    public int? ReviewContainsId { get; }

    public SearchReviewParameterDto(int? reviewContainsId)
    {
        ReviewContainsId = reviewContainsId;
    }
}