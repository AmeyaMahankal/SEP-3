namespace sep3.DTOs;

public class SearchMuseumParametersDto
{
    public string? NameContains { get; set; }
    public int? Id { get; set; }

    public SearchMuseumParametersDto(string? nameContains,  int? id)
    {
        NameContains = nameContains;
        Id = id;
    }

  
}