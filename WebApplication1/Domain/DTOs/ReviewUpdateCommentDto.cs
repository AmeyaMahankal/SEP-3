namespace Domain.DTOs;

public class ReviewUpdateCommentDto
{
    public int ReviewsId { get;  }
    public string ReviewsComment { get;  }


    public ReviewUpdateCommentDto(int reviewsId, string reviewsComment)
    {
        ReviewsId = reviewsId;
        ReviewsComment = reviewsComment;

    }
}