using Application.DaoInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace FileData.DAOs;

public class HotelFileDao : IHotelDao
{
    private readonly FileContext context;

    public HotelFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Hotel> CreateAsync(Hotel hotel)
    {
        int hotelId = 1;
        if (context.Hotels.Any())
        {
            hotelId = context.Hotels.Max(u => u.Id);
            hotelId++;
        }

        hotel.Id = hotelId;

        context.Hotels.Add(hotel);
        context.SaveChanges();

        return Task.FromResult(hotel);
    }
    
    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto dto)
    {
        IEnumerable<Hotel> result = context.Hotels.AsEnumerable();
        if (!string.IsNullOrEmpty(dto.Name))
        {
            result = context.Hotels.Where(u => u.Name.Equals(dto.NameContains, StringComparison.OrdinalIgnoreCase));
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
    

    public Task<Hotel?> GetByIdAsync(int id)
    {
        Hotel? existing = context.Hotels.FirstOrDefault(u => u.Id == id);
        return Task.FromResult(existing);
    }

    public Task DeleteAsync(int id)
    {
        Hotel? existing = context.Hotels.FirstOrDefault(hotel => hotel.Id == id);
        if (existing==null)
        {
            throw new Exception($"Does not exist!");
        }
        
        context.Hotels.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
}