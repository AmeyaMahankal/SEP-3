namespace Domain.DTOs;

public class ReviewUpdateDto
{
    public int ReviewsId { get;  }
    public string ReviewsComment { get;  }
    public int ReviewsStarReview { get; set; }

    public ReviewUpdateDto(int reviewsId, string reviewsComment, int reviewsStarReview)
    {
        ReviewsId = reviewsId;
        ReviewsComment = reviewsComment;
        ReviewsStarReview = reviewsStarReview;
    }
}