using Application.LogicInterface;
using SEP3lu;
using sep3.DTOs;
namespace Application.DaoInterfaces;

public interface IParkDao
{
    Task<Park> CreateAsync(Park park);
        
    Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParkParameters);
 
    Task<Park?> GetByIdAsync(int id);
    Task UpdateAsync(Park updated);
   Task DeleteAsync(int id);
   
}