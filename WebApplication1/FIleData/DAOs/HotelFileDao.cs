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
    
    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters)
    {
        IEnumerable<Hotel> hotels = context.Hotels.AsEnumerable();

        if (searchHotelParameters.Id != null)
        {
            hotels = context.Hotels.Where(u => u.Id.Equals(searchHotelParameters.Id));
        }

        return Task.FromResult(hotels);
    }

    public Task<Hotel?> GetByIdAsync(int dtoHotelId)
    {
        Hotel? existing = context.Hotels.FirstOrDefault(u => u.Id == dtoHotelId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(Hotel updated)
    {
        Hotel? existing = context.Hotels.FirstOrDefault(hotel => hotel.Id  == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Hotel with id {updated.Id} does not exist!");
        }

        context.Hotels.Remove(existing);
        context.Hotels.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
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