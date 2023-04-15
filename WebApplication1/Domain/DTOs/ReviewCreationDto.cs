namespace Shared.DTOs;

public class ReviewCreationDto
{
    public int Id { get;}
    public string CreateComment { get;}
    public int CreateStarReview { get;}

    public ReviewCreationDto(int id, string createComment, int createStarReview)
    {
        Id = id;
        CreateComment = createComment;
        CreateStarReview = createStarReview;
    }
}