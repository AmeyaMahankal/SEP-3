namespace sep3.DTOs;

public class SearchHotelParametersDto
{
    public string? NameContains { get; set; }
    public int? Id { get; set; }

    public SearchHotelParametersDto(string? nameContains,  int? id)
    {
        NameContains = nameContains;
        Id = id;
    }

  
}