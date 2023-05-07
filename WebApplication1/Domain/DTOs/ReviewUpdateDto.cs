namespace Domain.DTOs;

public class ReviewUpdateDto
{
    public int ReviewsId { get;  }
    public string ReviewsComment { get;  }
    public int ReviewsStarReview { get; set; }
    public int UserId { get;  }
    public int CategoryId { get;}
    public string CategoryName { get;}
    public string CategoryType { get;}

    public ReviewUpdateDto(int reviewsId, string reviewsComment, int reviewsStarReview, int userId, int categoryId, string categoryName, string categoryType)
    {
        ReviewsId = reviewsId;
        ReviewsComment = reviewsComment;
        ReviewsStarReview = reviewsStarReview;
        UserId = userId;
        CategoryId = categoryId;
        CategoryName = categoryName;
        CategoryType = categoryType;
    }
}