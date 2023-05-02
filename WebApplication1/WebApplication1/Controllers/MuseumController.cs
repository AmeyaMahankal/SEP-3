using Application.Logic;
using Application.LogicInterface;
using Microsoft.AspNetCore.Mvc;
using sep3.DTOs;
using SEP3lu;

namespace WEBAPI.Controllers;

[ApiController]
[Route("[controller]")]

public class MuseumController : ControllerBase
{
    private readonly IMuseumLogic museumLogic;

    public MuseumController(IMuseumLogic museumLogic)
    {
        this.museumLogic = museumLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Museum>> CreateAsync(MuseumCreationDto dto)
    {
        try
        {
            Museum museum = await museumLogic.CreateAsync(dto);
            return Created($"/museums/{museum.Id}", museum);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }


    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<Museum>>> GetAsync([FromQuery] string? name,
        [FromQuery] int? id)
    {
        try
        {
            SearchMuseumParametersDto parameters = new( name, id);
            IEnumerable<Museum> museums = await museumLogic.GetAsync(parameters);
            return Ok(museums);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] MuseumCreationDto dto)
    {
        try
        {
            await museumLogic.UpdateAsync(dto);
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
            await museumLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}