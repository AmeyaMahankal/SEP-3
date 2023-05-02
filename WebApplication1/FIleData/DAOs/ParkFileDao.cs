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

    public Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParkParameters)
    {
        IEnumerable<Park> parks = context.Parks.AsEnumerable();
        if (searchParkParameters.NameContains != null)
        {
            parks = context.Parks.Where(u => u.Name.Equals(searchParkParameters.NameContains));
        }
        if (searchParkParameters.Id != null)
        {
            parks = context.Parks.Where(u => u.Id.Equals(searchParkParameters.Id));
        }

        return Task.FromResult(parks);
    }

    public Task<Park?> GetByIdAsync(int dtoParkId)
    {
        Park? existing = context.Parks.FirstOrDefault(u => u.Id == dtoParkId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(Park updated)
    {
        Park? existing = context.Parks.FirstOrDefault(park => park.Id  == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Park with id {updated.Id} does not exist!");
        }

        context.Parks.Remove(existing);
        context.Parks.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
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