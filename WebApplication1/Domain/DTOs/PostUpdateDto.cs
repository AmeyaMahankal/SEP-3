namespace Domain.DTOs;

public class PostUpdateDto
{
    public int Id { get; }
    public int? OwnerId { get; }
    public string? Title { get; }
    public string? Description { get; }

    public PostUpdateDto(int id, int? ownerId, string? title, string? description)
    {
        Id = id;
        OwnerId = ownerId;
        Title = title;
        Description = description;
    }
}