using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace FileData.DAOs;

public class ParkFileDao: IParkDao
{
    private readonly FileContext context;

    public ParkFileDao(FileContext context)
    {
        this.context = context;
    }


    public Task <Park> CreateAsync( Park park)
    {
        int  parkId = 1;
        if (context.Parks.Any())
        {
            parkId = context.Parks.Max(u => u.Id);
            parkId++;
        }

        park.Id = parkId;
        
        context.Parks.Add(park);
        context.SaveChanges();

        return Task.FromResult(park);
    }

    public Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto dto)
    {
        IEnumerable<Park> result = context.Parks.AsEnumerable();
        if (!string.IsNullOrEmpty(dto.Name))
        {
            result = context.Parks.Where(u => u.Name.Equals(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }
        if (dto.Name!=null)
        {
            result = result.Where((t => t.Name == dto.Name));
        }

        if (!string.IsNullOrEmpty(dto.NameContains))
        {
            result = result.Where(t => t.Name.Contains(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }

        return Task.FromResult(result);
    }

    public Task<Park?> GetByIdAsync(int dtoParkId)
    {
        Park? existing = context.Parks.FirstOrDefault(u => u.Id == dtoParkId);
        return Task.FromResult(existing);
    }
    
    public Task DeleteAsync(int id)
    {
        Park? existing = context.Parks.FirstOrDefault(park => park.Id == id);
        if (existing==null)
        {
            throw new Exception($"Does not exist!");
        }
        
        context.Parks.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
}