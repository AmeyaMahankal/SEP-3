using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.Logic;

public class MuseumLogic: IMuseumLogic
{
    private readonly IMuseumDao museumDao;
    
    public MuseumLogic(IMuseumDao museumDao)
    {
        this.museumDao = museumDao;

    }

    public async Task<Museum> CreateAsync(MuseumCreationDto dto)
    {
        Museum toCreate = new Museum(dto.Name,dto.Description)
        {
            Name = dto.Name
            , Description = dto.Description,
            Id = dto.Id

        };

        Museum created = await museumDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto searchMuseumParameters)
    {
        return museumDao.GetAsync(searchMuseumParameters);
    }

    public async Task UpdateAsync(MuseumCreationDto dto)
    {
        Museum? existing = await museumDao.GetByIdAsync(dto.Id);
        if (existing == null)
        {
            throw new Exception($"Museum with ID {dto.Id} not found!");
        }

        Museum? museum = null;
        if (dto.Id != null)
        {
            museum = await museumDao.GetByIdAsync(dto.Id);
            if (museum == null)
            {
                throw new Exception($"Museum with id {dto.Id} was not found.");
            }
        }


        string nameToUse = dto.Name ?? existing.Name;

        string descToUseToUse = dto.Description ?? existing.Description;


        Museum updated = new(nameToUse, descToUseToUse);
        {
            updated.Name = nameToUse;
            updated.Description = descToUseToUse;
            updated.Id = existing.Id;
        }
        await museumDao.UpdateAsync(updated);
    }

    public async Task DeleteAsync(int id)
    {
        Museum? museum = await museumDao.GetByIdAsync(id);
        if (museum == null)
        {
            throw new Exception("not found!");
        }

        await museumDao.DeleteAsync(id);
    }
    
}