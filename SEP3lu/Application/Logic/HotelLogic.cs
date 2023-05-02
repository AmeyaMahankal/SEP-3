using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.Logic;

public class HotelLogic: IHotelLogic
{
    private readonly IHotelDao hotelDao;
    
    public HotelLogic(IHotelDao hotelDao)
    {
        this.hotelDao = hotelDao;

    }

    public async Task<Hotel> CreateAsync(HotelCreationDto dto)
    {
        Hotel toCreate = new Hotel(1,"Ambasador","5 star hotel.")
        {
            Name = dto.Name
            , Description = dto.Description,
            Id = dto.Id

        };

        Hotel created = await hotelDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters)
    {
        return hotelDao.GetAsync(searchHotelParameters);
    }
    

    public async Task DeleteAsync(int id)
    {
        Hotel? hotel = await hotelDao.GetByIdAsync(id);
        if (hotel == null)
        {
            throw new Exception("not found!");
        }

        await hotelDao.DeleteAsync(id);
    }

   
}