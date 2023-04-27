using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface ICityDao
{
    Task<City> CreateAsync(City city);

    Task<IEnumerable<City>> GetAsync(SearchCityParametersDto dto);

    Task<City?> GetByIdAsync(int id);
    Task UpdateAsync(City updated);

    Task DeleteAsync(int id);
}