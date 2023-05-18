using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication1.Controllers;

[ApiController]
[Route("[controller]")]
public class HotelsReviewController: ControllerBase
{
    private readonly IHotelsReviewLogic _hotelsReviewLogic;

    public HotelsReviewController(IHotelsReviewLogic hotelsReviewLogic)
    {
        this._hotelsReviewLogic = hotelsReviewLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Review>> CreateAsync(ReviewCreationDto dto)
    {
        try
        {
            Review review = await _hotelsReviewLogic.CreateAsync(dto);
            return Created($"/reviews/{review.Id}", review);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    
    
    [HttpGet("CategorySearch")]
    public async Task<ActionResult<IEnumerable<Review>>> GetListOfReviews( [FromQuery] int? categoryid)
    {
        try
        {
            SearchReviewParameterDto parameters = new( categoryid);
            IEnumerable<Review> reviews = await _hotelsReviewLogic.GetByCategory(parameters);
            return Ok(reviews);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    

    [HttpPatch("UpdateComment")]
    public async Task<ActionResult> UpdateAsync([FromBody] ReviewUpdateCommentDto commentDto)
    {
        try
        {
            await _hotelsReviewLogic.UpdateReviewCommentAsync(commentDto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
  
    [HttpPatch("UpdateStarReview")]
    public async Task<ActionResult> UpdateAsync([FromBody] ReviewUpdateStarReviewDto starReviewDto)
    {
        try
        {
            await _hotelsReviewLogic.UpdateReviewStarReviewAsync(starReviewDto);
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
            await _hotelsReviewLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }    
}