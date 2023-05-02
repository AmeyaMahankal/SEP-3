using Application.LogicInterface;
using Microsoft.AspNetCore.Mvc;
using sep3.DTOs;
using SEP3lu;

namespace WEBAPI.Controllers;

    [ApiController]
    [Route("[controller]")]
    public class ParkController: ControllerBase
    {
        private readonly IParkLogic parkLogic;
    
        public ParkController(IParkLogic parkLogic)
        {
            this.parkLogic = parkLogic;
        }
    
        [HttpPost]
        public async Task<ActionResult<Park>> CreateAsync(ParkCreationDto dto)
        {
            try
            {
                Park park = await parkLogic.CreateAsync(dto);
                return Created($"/parks/{park.Id}", park);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
    
    
        }
    
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Park>>> GetAsync([FromQuery] string? name,[FromQuery] int? id )
        {
            try
            {
                SearchParkParametersDto parameters = new(name, id);
                IEnumerable<Park>parks = await parkLogic.GetAsync(parameters);
                return Ok(parks);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
        [HttpPatch]
        public async Task<ActionResult> UpdateAsync([FromBody] ParkCreationDto dto)
        {
            try
            {
                await parkLogic.UpdateAsync(dto);
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
                await parkLogic.DeleteAsync(id);
                return Ok();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return StatusCode(500, e.Message);
            }
        }
        
}