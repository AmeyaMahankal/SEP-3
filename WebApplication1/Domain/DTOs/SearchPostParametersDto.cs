namespace Domain.DTOs;

public class SearchPostParametersDto
{
    public string? username { get; }
    public int? UserId { get; }
    public string? TitleContains { get; }

    public SearchPostParametersDto(string? username, int? userId, string? titleContains)
    {
        this.username = username;
        UserId = userId;
        TitleContains = titleContains;
    }
}