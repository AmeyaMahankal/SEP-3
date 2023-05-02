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
        Museum toCreate = new Museum(1,"Mimara","Art museum in Zagreb.")
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