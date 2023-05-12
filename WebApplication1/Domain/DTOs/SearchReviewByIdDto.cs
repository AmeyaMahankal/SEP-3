namespace Domain.DTOs;

public class SearchReviewByIdDto
{
    public int? ReviewContainsId { get; }

    public SearchReviewByIdDto(int reviewId)
    {
        this.ReviewContainsId = reviewId;
    }
}