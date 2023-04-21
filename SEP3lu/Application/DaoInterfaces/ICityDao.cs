using Application.Logic;
using sep3.DTOs;
using SEP3lu;

namespace Application.DaoInterfaces;

public interface ICityDao
{
    Task<City> CreateAsync(City city);
    
    Task<City?> GetByNameAsync(string name);
    Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchCityParameters);
    Task DeleteAsync(int id);
    Task<City?> GetByIdAsync(int id);
}