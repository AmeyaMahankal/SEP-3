namespace Domain.DTOs;

public class SearchCityParametersDto
{
    public int? CityContainsId { get; }
    public String? CityContainsName { get; }
  

    public SearchCityParametersDto(int? cityContainsId, string? cityContainsName )
    {
        CityContainsId = cityContainsId;
        CityContainsName = cityContainsName;
    }
}