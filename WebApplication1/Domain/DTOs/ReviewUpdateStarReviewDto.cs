namespace Domain.DTOs;

public class ReviewUpdateStarReviewDto
{
    public int ReviewsId { get;  }
    public int ReviewsStarReview { get;  }


    public ReviewUpdateStarReviewDto(int reviewsId, int reviewsStarReview)
    {
        ReviewsId = reviewsId;
        ReviewsStarReview = reviewsStarReview;

    }
}