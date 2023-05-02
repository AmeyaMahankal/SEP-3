namespace sep3.DTOs;

public class SearchRestaurantParametersDto
{
    public string? NameContains { get; set; }
    public string? Name { get; set; }
    
    public int? Id { get; set; }

    public SearchRestaurantParametersDto(string? nameContains, string? name, int? id)
    {
        NameContains = nameContains;
        Name = name;
        Id = id;
    }

  
}