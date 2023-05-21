namespace sep3.DTOs;

public class SearchMuseumParametersDto
{

    public int Id { get; set; }

    public SearchMuseumParametersDto(  int? id)
    {

        Id = (int)id;
    }

  
}