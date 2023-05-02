using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace FileData.DAOs;

public class MuseumFileDao : IMuseumDao

{ 
    private readonly FileContext context;

    public MuseumFileDao(FileContext context)
    {
        this.context = context;
    }
    public Task<Museum> CreateAsync(Museum museum)
    {
        int museumId = 1;
        if (context.Museums.Any())
        {
            museumId = context.Museums.Max(u => u.Id);
            museumId++;
        }

        museum.Id = museumId;
        
        context.Museums.Add(museum);
        context.SaveChanges();

        return Task.FromResult(museum);
    }
    public Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto searchMuseumParameters)
    {
        IEnumerable<Museum> museums = context.Museums.AsEnumerable();
        if (searchMuseumParameters.NameContains != null)
        {
            museums = context.Museums.Where(u => u.Name.Equals(searchMuseumParameters.NameContains));
        }
        if (searchMuseumParameters.Id != null)
        {
            museums = context.Museums.Where(u => u.Id.Equals(searchMuseumParameters.Id));
        }

        return Task.FromResult(museums);
    }

    public Task<Museum?> GetByIdAsync(int dtoMuseumId)
    {
        Museum? existing = context.Museums.FirstOrDefault(u => u.Id == dtoMuseumId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(Museum updated)
    {
        Museum? existing = context.Museums.FirstOrDefault(museum => museum.Id  == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Museum with id {updated.Id} does not exist!");
        }

        context.Museums.Remove(existing);
        context.Museums.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
    }

    
    public Task DeleteAsync(int id)
    {
        Museum? existing = context.Museums.FirstOrDefault(post => post.Id == id);
        if (existing==null)
        {
            throw new Exception($"Does not exist!");
        }
        
        context.Museums.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
    
}