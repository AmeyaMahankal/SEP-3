using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.DaoInterfaces;


    public interface IHotelDao
    {
        Task<Hotel> CreateAsync(Hotel hotel);
        
        public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters);
        Task<Hotel?> GetByIdAsync(int id);
        Task UpdateAsync(Hotel updated);
        Task DeleteAsync(int id);
        
}