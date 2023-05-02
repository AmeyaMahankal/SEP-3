
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
        Park toCreate = new Park(1,"Maksimir","Biggest park in Zagreb.")
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