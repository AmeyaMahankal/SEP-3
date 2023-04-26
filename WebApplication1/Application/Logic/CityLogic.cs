using System.Data.Common;
using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class CityLogic: ICityLogic
{

    private readonly ICityDao cityDao;
   

    public CityLogic(ICityDao cityDao)
    {
        this.cityDao = cityDao;
    }

    public async Task<City> CreateAsync(CityCreationDto dto)
    {
        
        ValidateCity(dto);
        City toCreate = new City
        {
            Name = dto.Name
            , Description = dto.Description

        };

        City created = await cityDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto dto)
    {
        return cityDao.GetAsync(dto);
    }
    
        public async Task UpdateAsync(CityUpdateDto dto)
        {
            City? existing = await cityDao.GetByIdAsync(dto.Id);
            if (existing == null)
            {
                throw new Exception($"City with ID {dto.Id} not found!");
            }
     
            City? city = null;
            if (dto.Id != null)
            {
                city = await cityDao.GetByIdAsync(dto.Id);
                if (city == null)
                {
                    throw new Exception($"City with id {dto.Id} was not found.");
                }
            }

            string nameToUse = dto.Name ?? existing.Name;
            string descToUse = dto.Description ?? existing.Description;
            City updated = new();
            {
                updated.Description = descToUse;
                updated.Name = nameToUse;
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

    private void ValidateCity(CityCreationDto dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Name cannot be empty.");
    }
}