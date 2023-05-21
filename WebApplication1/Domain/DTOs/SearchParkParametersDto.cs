namespace sep3.DTOs;

public class SearchParkParametersDto
{
    public int Id { get; set; }

    public SearchParkParametersDto(  int? id)
    {
        Id = (int)id;
    }

  
}