namespace sep3.DTOs;

public class SearchParkParametersDto
{
    public string? NameContains { get; set; }
    public int? Id { get; set; }

    public SearchParkParametersDto(string? nameContains,  int? id)
    {
        NameContains = nameContains;
        Id = id;
    }

  
}