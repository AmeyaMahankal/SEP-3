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
    public Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto dto)
    {
        IEnumerable<Museum> result = context.Museums.AsEnumerable();
        if (!string.IsNullOrEmpty(dto.Name))
        {
            result = context.Museums.Where(u => u.Name.Equals(dto.NameContains, StringComparison.OrdinalIgnoreCase));
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

    public Task<Museum?> GetByIdAsync(int dtoMuseumId)
    {
        Museum? existing = context.Museums.FirstOrDefault(u => u.Id == dtoMuseumId);
        return Task.FromResult(existing);
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