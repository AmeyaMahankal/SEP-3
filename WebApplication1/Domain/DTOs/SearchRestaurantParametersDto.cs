namespace sep3.DTOs;

public class SearchRestaurantParametersDto
{

  
    
    public int Id { get; set; }

    public SearchRestaurantParametersDto( int? id)
    {
        Id = (int)id;
    }

  
}