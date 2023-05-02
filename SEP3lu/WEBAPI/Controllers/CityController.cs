using Application.Logic;
using Application.LogicInterface;
using Microsoft.AspNetCore.Http.HttpResults;
using Microsoft.AspNetCore.Mvc;
using sep3.DTOs;
using SEP3lu;


namespace WEBAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class CityController: ControllerBase
{
    private readonly ICityLogic CityLogic;

    public CityController(ICityLogic cityLogic)
    {
        CityLogic = cityLogic;
    }

    [HttpPost]
    public async Task<ActionResult<City>> CreateAsync([FromBody] CityCreationDto dto)
    {
        try
        {
            City created = await CityLogic.CreateAsync(dto);
            return Created($"/citys/{created.Id}", created);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }


    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<City>>> GetAsync([FromQuery] string? name,[FromQuery] string? nameContains,[FromQuery] int? id )
    {
        try
        {
            SearchCityParametersDto parameters = new(nameContains,name, id);
            var citys = await CityLogic.GetAsync(parameters);
            return Ok(citys);
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
            await CityLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}