namespace Domain.DTOs;

public class SearchReviewParameterDto
{
    public int? ReviewContainsId { get; }
    public int? ReviewContainsCategoryId { get;}
    public string? ReviewContainsCategoryName { get;}
    public string? ReviewContainsCategoryType { get;}

    public SearchReviewParameterDto(int? reviewContainsId, int? reviewContainsCategoryId, string? reviewContainsCategoryName, string? reviewContainsCategoryType)
    {
        ReviewContainsId = reviewContainsId;
        ReviewContainsCategoryId = reviewContainsCategoryId;
        ReviewContainsCategoryName = reviewContainsCategoryName;
        ReviewContainsCategoryType = reviewContainsCategoryType;
    }
}