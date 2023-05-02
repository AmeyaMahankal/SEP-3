﻿
using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.Logic;

public class ParkLogic: IParkLogic
{
    private readonly IParkDao parkDao;
    
    public ParkLogic(IParkDao parkDao)
    {
        this.parkDao = parkDao;

    }

    public async Task<Park> CreateAsync(ParkCreationDto dto)
    {
        Park toCreate = new Park(dto.Name,dto.Description)
        {
            Name = dto.Name
            , Description = dto.Description,
            Id = dto.Id

        };

        Park created = await parkDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParkParameters)
    {
        return parkDao.GetAsync(searchParkParameters);
    }

    public async Task UpdateAsync(ParkCreationDto dto)
    {
        Park? existing = await parkDao.GetByIdAsync(dto.Id);
        if (existing == null)
        {
            throw new Exception($"Park with ID {dto.Id} not found!");
        }

        Park? park = null;
        if (dto.Id != null)
        {
            park = await parkDao.GetByIdAsync(dto.Id);
            if (park == null)
            {
                throw new Exception($"Park with id {dto.Id} was not found.");
            }
        }


        string nameToUse = dto.Name ?? existing.Name;

        string descToUseToUse = dto.Description ?? existing.Description;


        Park updated = new(nameToUse, descToUseToUse);
        {
            updated.Name = nameToUse;
            updated.Description = descToUseToUse;
            updated.Id = existing.Id;
        }
        await parkDao.UpdateAsync(updated);
    }


    public async Task DeleteAsync(int id)
    {
        Park? park = await parkDao.GetByIdAsync(id);
        if (park == null)
        {
            throw new Exception("not found!");
        }

        await parkDao.DeleteAsync(id);
    }

   
}