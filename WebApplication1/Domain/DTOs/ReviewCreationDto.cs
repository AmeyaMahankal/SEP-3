namespace Domain.DTOs;

public class ReviewCreationDto
{
    public string CreateComment { get;}
    public int CreateStarReview { get;}
    public int OwnerId { get;  }

    public ReviewCreationDto(string createComment, int createStarReview, int ownerId)
    {
        CreateComment = createComment;
        CreateStarReview = createStarReview;
        OwnerId = ownerId;
    }
}