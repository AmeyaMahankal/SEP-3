using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class CityLogic : ICityLogic
{

    private readonly ICityDao cityDao;
    

    public CityLogic(ICityDao cityDao)
    {
        this.cityDao = cityDao;
    }
    
    public async Task<City> CreateAsync(CityCreationDto dto)
    {
        
       // ValidateData(dto);
        City toCreate = new City(dto.Name,dto.Description)
        {
            Name = dto.Name
            , Description = dto.Description

        };

        City created = await cityDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto searchCityParameters)
    {
        return cityDao.GetAsync(searchCityParameters);
    }
    
    
    
      public async Task UpdateAsync(CityUpdateDto dto)
      {
          City? existing = await cityDao.GetByIdAsync(dto.CityId);
     if (existing == null)
     {
         throw new Exception($"City with ID {dto.CityId} not found!");
     }
     
     City? city = null;
     if (dto.CityId != null)
     {
         city = await cityDao.GetByIdAsync(dto.CityId);
         if (city == null)
         {
             throw new Exception($"City with id {dto.CityId} was not found.");
         }
     }

   
     string nameToUse = dto.Name ?? existing.Name;

     string descToUseToUse =dto.Description?? existing.Description ;
     

     City updated = new(nameToUse,descToUseToUse);
     {
         updated.Name = nameToUse;
         updated.Description = descToUseToUse ;
         updated.Id = existing.Id;
     }

    
     await cityDao.UpdateAsync(updated);
 }

      public async Task DeleteAsync(int id)
      {
          City? city = await cityDao.GetByIdAsync(id);
          if (city == null)
          {
              throw new Exception($"City with ID {id} was not found!");
          }

          await cityDao.DeleteAsync(id);
      }
    
    
    
    
    
    
    
      
    //todo add some filtering
    private static void ValidateData(CityCreationDto cityCreationDto)
    {
        
    }
}

