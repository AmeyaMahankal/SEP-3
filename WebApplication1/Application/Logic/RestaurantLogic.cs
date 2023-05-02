using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.Logic;

public class RestaurantLogic: IRestaurantLogic
{
    private readonly IRestaurantDao restaurantDao;
    
    public RestaurantLogic(IRestaurantDao restaurantDao)
    {
        this.restaurantDao = restaurantDao;

    }

    public async Task<Restaurant> CreateAsync(RestaurantCreationDto dto)
    {
        Restaurant toCreate = new Restaurant(1,"Bella","Best Italian restaurant.")
        {
            Name = dto.Name
            , Description = dto.Description,
            Id = dto.Id

        };

        Restaurant created = await restaurantDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchRestaurantParameters)
    {
        return restaurantDao.GetAsync(searchRestaurantParameters);
    }
    

    public async Task DeleteAsync(int id)
    {
        Restaurant? restaurant = await restaurantDao.GetByIdAsync(id);
        if (restaurant == null)
        {
            throw new Exception("not found!");
        }

        await restaurantDao.DeleteAsync(id);
    }

   
}