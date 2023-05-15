namespace sep3.DTOs;

public class SearchRestaurantParametersDto
{
    public string? NameContains { get; set; }
  
    
    public int Id { get; set; }

    public SearchRestaurantParametersDto(string? nameContains, int? id)
    {
        NameContains = nameContains;
        Id = (int)id;
    }

  
}