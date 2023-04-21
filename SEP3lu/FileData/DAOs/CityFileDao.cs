using Application.DaoInterfaces;
using sep3.DTOs;
using SEP3lu;

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
        if (context.Citys.Any())
        {
            id = context.Citys.Max(t => t.Id);
            id++;
        }

        city.Id = id;
        context.Citys.Add(city);
        context.SaveChanges();
        return Task.FromResult(city);;
    }

   

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto dto)
    {
        IEnumerable<City> result = context.Citys.AsEnumerable();
        if (dto.NameContains != null)
        {
            result = context.Citys.Where(u => u.Name.Contains(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }
        if (dto.Id!=null)
        {
            result = result.Where((t => t.Name == dto.Name));
        }

        if (!string.IsNullOrEmpty(dto.NameContains))
        {
            result = result.Where(t => t.Name.Contains(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }

        return Task.FromResult(result);
    }

   


    public Task<City?> GetByIdAsync(int id)
    {
        City? existing = context.Citys.FirstOrDefault(t => t.Id == id);
        return Task.FromResult(existing);
        
    }
    public Task<City?> GetByNameAsync(string name)
    {
       City? existing = context.Citys.FirstOrDefault(t=>t.Name==name);
       return Task.FromResult(existing);
    }
    
    public Task DeleteAsync(int id)
    {
        City? existing = context.Citys.FirstOrDefault(post => post.Id == id);
        if (existing==null)
        {
            throw new Exception($"City with id {id} does not exist!");
        }

        context.Citys.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
   
}
