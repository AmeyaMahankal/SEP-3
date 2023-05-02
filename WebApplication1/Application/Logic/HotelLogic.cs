using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
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
        Hotel toCreate = new Hotel(dto.Name,dto.Description)
        {
            Name = dto.Name
            , Description = dto.Description
        };

        Hotel created = await hotelDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters)
    {
        return hotelDao.GetAsync(searchHotelParameters);
    }

    public async Task UpdateAsync(HotelCreationDto dto)
    {
        Hotel? existing = await hotelDao.GetByIdAsync(dto.Id);
        if (existing == null)
        {
            throw new Exception($"Hotel with ID {dto.Id} not found!");
        }
     
        Hotel? hotel = null;
        if (dto.Id != null)
        {
            hotel = await hotelDao.GetByIdAsync(dto.Id);
            if (hotel == null)
            {
                throw new Exception($"Hotel with id {dto.Id} was not found.");
            }
        }

   
        string nameToUse = dto.Name ?? existing.Name;

        string descToUseToUse =dto.Description?? existing.Description ;
     

        Hotel updated = new(nameToUse,descToUseToUse);
        {
            updated.Name = nameToUse;
            updated.Description = descToUseToUse ;
            updated.Id = existing.Id;
        }

    
        await hotelDao.UpdateAsync(updated);
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