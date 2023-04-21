using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;


namespace Application.Logic;

public class CityLogic : ICityLogic
{

    private readonly ICityDao CityDao;


    public CityLogic(ICityDao cityDao)
    {
        CityDao = cityDao;

    }

    public async Task<City> CreateAsync(CityCreationDto cityToCreate)
    {
        City? cityy = await CityDao.GetByIdAsync(cityToCreate.Id);
        if (cityy == null)

        {
            throw new Exception("error");
        }

        ValidatePost(cityToCreate);
        City city = new City(5,"Zagreb", "Zagreb is a beautiful city.");
        City created = await CityDao.CreateAsync(city);
        return created;
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchParameters)
        {
            return CityDao.GetAsync(searchParameters);
        }
    
    
    
    public async Task DeleteAsync(int id)
    {
        City? city = await CityDao.GetByIdAsync(id);
        if (city == null)
        {
            throw new Exception("not found!");
        }

        await CityDao.DeleteAsync(id);
    }

    private void ValidatePost(CityCreationDto dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Name cannot be empty.");
    }
    }
