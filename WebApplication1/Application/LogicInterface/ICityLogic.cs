using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterface;

public interface ICityLogic
{
    Task<City> CreateAsync(CityCreationDto dto);

    Task<IEnumerable<City>> GetAsync(SearchCityParametersDto dto);

    Task UpdateAsync(CityUpdateDto dto);

    Task DeleteAsync(int id);
}