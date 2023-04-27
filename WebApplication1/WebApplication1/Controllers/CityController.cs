using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication1.Controllers;

[ApiController]
[Route("[controller]")]
public class CityController: ControllerBase
{
    private readonly ICityLogic cityLogic;

    public CityController(ICityLogic cityLogic)
    { 
        this.cityLogic = cityLogic;
    }

    [HttpPost]
    public async Task<ActionResult<City>> CreateAsync(CityCreationDto dto)
    {
        try
        {
            City city = await cityLogic.CreateAsync(dto);
            return Created($"/citys/{city.Id}", city);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<City>>> GetAsync([FromQuery] int? id, [FromQuery] String? name)
    {
        try
        {
            
            SearchCityParametersDto parameters = new(id,name);
            IEnumerable<City> cities = await cityLogic.GetAsync(parameters);
            return Ok(cities);
        }
        
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] CityUpdateDto dto)
    {
        try
        {
            await cityLogic.UpdateAsync(dto);
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
            await cityLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}