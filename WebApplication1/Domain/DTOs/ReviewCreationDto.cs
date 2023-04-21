namespace Domain.DTOs;

public class ReviewCreationDto
{
    public string CreateComment { get;}
    public int CreateStarReview { get;}

    public ReviewCreationDto(string createComment, int createStarReview)
    {
  
        CreateComment = createComment;
        CreateStarReview = createStarReview;
    }
}