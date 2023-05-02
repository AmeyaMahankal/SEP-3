using Application.LogicInterface;
using Microsoft.AspNetCore.Mvc;
using sep3.DTOs;
using SEP3lu;

namespace WEBAPI.Controllers;

    [ApiController]
    [Route("[controller]")]
    
    public class HotelController: ControllerBase
    {
        private readonly IHotelLogic HotelLogic;
    
        public HotelController(IHotelLogic hotelLogic)
        {
            HotelLogic = hotelLogic;
        }
    
        [HttpPost]
        public async Task<ActionResult<Hotel>> CreateAsync(HotelCreationDto dto)
        {
            try
            {
                Hotel hotel = await HotelLogic.CreateAsync(dto);
                return Created($"/hotels/{hotel.Id}", hotel);
    
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
    
    
        }
    
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Hotel>>> GetAsync([FromQuery] string? name,[FromQuery] int? id )
        {
            try
            {
                SearchHotelParametersDto parameters = new(name,id);
                IEnumerable<Hotel> hotels = await HotelLogic.GetAsync(parameters);
                return Ok(hotels);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
        [HttpPatch]
        public async Task<ActionResult> UpdateAsync([FromBody] HotelCreationDto dto)
        {
            try
            {
                await HotelLogic.UpdateAsync(dto);
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
                await HotelLogic.DeleteAsync(id);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
}