using sep3.DTOs;
using SEP3lu;

namespace Application.LogicInterface;

public interface IMuseumLogic
{
   
        Task<Museum> CreateAsync(MuseumCreationDto cityToCreate);
        Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto searchParameters);
        Task UpdateAsync(MuseumCreationDto dto);
        Task DeleteAsync(int id);
        
}
