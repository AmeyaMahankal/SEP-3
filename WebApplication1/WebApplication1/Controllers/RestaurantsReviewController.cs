using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication1.Controllers;

[ApiController]
[Route("[controller]")]
public class RestaurantsReviewController: ControllerBase
{
    private readonly IRestaurantsReviewLogic restaurantsReviewLogic;

    public RestaurantsReviewController(IRestaurantsReviewLogic restaurantsReviewLogic)
    {
        this.restaurantsReviewLogic = restaurantsReviewLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Review>> CreateAsync(ReviewCreationDto dto)
    {
        try
        {
            Review review = await restaurantsReviewLogic.CreateAsync(dto);
            return Created($"/reviews/{review.Id}", review);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Review>>> GetListOfReviews( [FromQuery] int? categoryid)
    {
        try
        {
            SearchReviewParameterDto parameters = new( categoryid);
            IEnumerable<Review> reviews = await restaurantsReviewLogic.GetByCategory(parameters);
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
            await restaurantsReviewLogic.UpdateReviewCommentAsync(commentDto);
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
            await restaurantsReviewLogic.UpdateReviewStarReviewAsync(starReviewDto);
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
            await restaurantsReviewLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }    
}