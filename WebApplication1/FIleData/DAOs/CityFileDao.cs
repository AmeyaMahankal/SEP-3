using Application.DaoInterfaces;
using Application.Logic;
using Domain.DTOs;
using Domain.Models;

namespace FileData.DAOs;

public class CityFileDao: ICityDao
{
    private readonly FileContext context;

    public CityFileDao(FileContext context)
    {
        this.context = context;
    }
    
    public Task<City> CreateAsync(City city)
    {
        int cityId = 1;
        if (context.Cities.Any())
        {
            cityId = context.Cities.Max(u => u.Id);  
            cityId++;
        }

        city.Id = cityId;
        
        context.Cities.Add(city);
        context.SaveChanges();

        return Task.FromResult(city);
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchCityParameters)
    {
        IEnumerable<City> cities = context.Cities.AsEnumerable();
        if (searchCityParameters.CityContainsName != null)
        {
            cities = context.Cities.Where(u => u.Name.Equals(searchCityParameters.CityContainsName));
        }
        if (searchCityParameters.CityContainsId != null)
        {
            cities = context.Cities.Where(u => u.Id.Equals(searchCityParameters.CityContainsId));
        }

        return Task.FromResult(cities);
    }

    public Task<City?> GetByIdAsync(int dtoCityId)
    {
        City? existing = context.Cities.FirstOrDefault(u => u.Id == dtoCityId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(City updated)
    {
        City? existing = context.Cities.FirstOrDefault(city => city.Id  == updated.Id);
        if (existing == null)
        {
            throw new Exception($"City with id {updated.Id} does not exist!");
        }

        context.Cities.Remove(existing);
        context.Cities.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
    }
    
    
    public Task DeleteAsync(int id)
    {
        City? existing = context.Cities.FirstOrDefault(city => city.Id == id);
        if (existing==null)
        {
            throw new Exception($"City with id {id} does not exist!");
        }
        
        context.Cities.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
}