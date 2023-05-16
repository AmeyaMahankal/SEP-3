using Application.LogicInterface;
using Microsoft.AspNetCore.Mvc;
using sep3.DTOs;
using SEP3lu;

namespace WEBAPI.Controllers;

    [ApiController]
    [Route("[controller]")]
    public class RestaurantController: ControllerBase
    {
        private readonly IRestaurantLogic restaurantLogic;
    
        public RestaurantController(IRestaurantLogic restaurantLogic)
        {
            this.restaurantLogic = restaurantLogic;
        }
    
        [HttpPost]
        public async Task<ActionResult<Restaurant>> CreateAsync(RestaurantCreationDto dto)
        {
            try
            {
                Restaurant restaurant = await restaurantLogic.CreateAsync(dto);
                return Created($"/restaurants/{restaurant.Id}", restaurant);
    
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
    
    
        }
    
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Restaurant>>> GetAsync([FromQuery] int? id )
        {
            try
            {
                SearchRestaurantParametersDto parameters = new( id);
                var restaurants = await restaurantLogic.GetAsync(parameters);
                return Ok(restaurants);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
        [HttpPatch]
        public async Task<ActionResult> UpdateAsync([FromBody] RestaurantUpdateDto dto)
        {
            try
            {
                await restaurantLogic.UpdateAsync(dto);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }

        
        [HttpDelete("{id:int}")]
        public async Task<ActionResult> DeleteAsync([FromRoute] int id)
        {
            try
            {
                await restaurantLogic.DeleteAsync(id);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
}