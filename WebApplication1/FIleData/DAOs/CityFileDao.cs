using Application.DaoInterfaces;
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
        int id = 1;
        if (context.Cities.Any())
        {
            id = context.Cities.Max(t => t.Id);
            id++;
        }

        city.Id = id;
        context.Cities.Add(city);
        context.SaveChanges();
        return Task.FromResult(city);
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchCityParametersDto)
    {
        IEnumerable<City> cities = context.Cities.AsEnumerable(); 
        if (searchCityParametersDto.CityContainsId!=null )//searchReviewParameterDto.ReviewContainsId != null)
        {
            cities = context.Cities.Where(u => u.Id.Equals(searchCityParametersDto.CityContainsId));
        }

        return Task.FromResult(cities);
    }
    public Task<City?> GetByIdAsync(int id)
    {
        City? existing = context.Cities.FirstOrDefault(t => t.Id == id);
        return Task.FromResult(existing);
    }

    public Task UpdateAsync(City updated)
    {
      
        City? existing = context.Cities.FirstOrDefault(City => City.Id == updated.Id);
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