using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication1.Controllers;

[ApiController]
[Route("[controller]")]
public class ReviewController: ControllerBase
{
    private readonly IReviewLogic reviewLogic;

    public ReviewController(IReviewLogic reviewLogic)
    {
        this.reviewLogic = reviewLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Review>> CreateAsync(ReviewCreationDto dto)
    {
        try
        {
            Review review = await reviewLogic.CreateAsync(dto);
            return Created($"/reviews/{review.Id}", review);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Review>>> GetListOfReviews([FromQuery] int? id, [FromQuery] int? categoryid,[FromQuery] string? categoryname, string? categorytype )
    {
        try
        {
            SearchReviewParameterDto parameters = new( id,categoryid,categoryname,categorytype);
            IEnumerable<Review> reviews = await reviewLogic.GetByCategory(parameters);
            return Ok(reviews);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
  /*  public async Task<ActionResult<Review>> GetAsync([FromQuery]int id,[FromQuery] int? categoryid,[FromQuery] string? categoryname, string? categorytype )
    {
        try
        {
            SearchReviewByIdDto parameters = new(id);
            Review reviews = await reviewLogic.GetAsync(parameters);
            return Ok(reviews);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }*/

    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] ReviewUpdateDto dto)
    {
        try
        {
            await reviewLogic.UpdateAsync(dto);
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
            await reviewLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }    
}