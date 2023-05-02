using Application.Logic;
using sep3.DTOs;
using SEP3lu;

namespace Application.LogicInterface;

public interface ICityLogic
{
    Task<City> CreateAsync(CityCreationDto cityToCreate);
    Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchParameters);

    Task DeleteAsync(int id);

}