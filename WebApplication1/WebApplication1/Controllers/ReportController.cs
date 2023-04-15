using Application.LogicInterfaces;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;

namespace WebAPI.Controllers;


[ApiController]
[Route("[controller]")]
public class ReportController: ControllerBase
{
    private readonly IReportLogic reportLogic;

    public ReportController(IReportLogic reportLogic)
    {
        this.reportLogic = reportLogic;
    }
    
    
    [HttpPost]
    public async Task<ActionResult<Report>> CreateAsync([FromBody]ReportCreationDto dto)
    {
        try
        {
            Report created = await reportLogic.CreateAsync(dto);
            return Created($"/reports/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Report>>> GetAsync([FromQuery] int? id)
    {
        try
        {
            SearchReportPeremitersDto parameters = new(id);
            IEnumerable<Report> reports = await reportLogic.GetAsync(parameters);
            return Ok(reports);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
}