namespace Domain.DTOs;

public class SearchCityParametersDto
{
    public String? CityContainsName { get; }
  

    public SearchCityParametersDto( string? cityContainsName )
    {
        CityContainsName = cityContainsName;
    }
}