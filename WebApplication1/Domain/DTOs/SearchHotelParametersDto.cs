namespace sep3.DTOs;

public class SearchHotelParametersDto
{

    public int Id { get; set; }

    public SearchHotelParametersDto(  int? id)
    {

        Id = (int)id;
    }

  
}