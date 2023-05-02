using Application.LogicInterface;
using SEP3lu;
using sep3.DTOs;
namespace Application.DaoInterfaces;

public interface IMuseumDao
{
        Task<Museum> CreateAsync(Museum museum);
        
        Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto searchMuseumParameters);
        Task<Museum?> GetByIdAsync(int id);
        Task UpdateAsync(Museum updated);
        
        Task DeleteAsync(int id);
        
}