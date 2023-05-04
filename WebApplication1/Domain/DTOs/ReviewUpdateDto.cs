namespace Domain.DTOs;

public class ReviewUpdateDto
{
    public int ReviewsId { get;  }
    public int? OwnerId { get; }
    public string ReviewsComment { get;  }
    public int ReviewsStarReview { get; set; }

    public ReviewUpdateDto(int reviewsId, int? ownerId, string reviewsComment, int reviewsStarReview)
    {
        ReviewsId = reviewsId;
        OwnerId = ownerId;
        ReviewsComment = reviewsComment;
        ReviewsStarReview = reviewsStarReview;
    }
}