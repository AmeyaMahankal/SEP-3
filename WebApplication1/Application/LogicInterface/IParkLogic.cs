using sep3.DTOs;
using SEP3lu;

namespace Application.LogicInterface;

public interface IParkLogic
{
    Task<Park> CreateAsync(ParkCreationDto parkToCreate);
    Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParameters);
    Task UpdateAsync(ParkUpdateDto dto);
    Task DeleteAsync(int id);
}


