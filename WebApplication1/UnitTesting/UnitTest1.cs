using Application.DaoInterfaces;
using Application.Logic;
using Domain.DTOs;
using Domain.Models;
using FileData.GrpcDAOs;
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Controllers;

namespace UnitTesting;

public class Tests
{
    /*
    [SetUp]
    public void Setup()
    {
    }
*/
    [Test]
    public void GetCity()
    {
        ICityDao cityDao = new CityDAO();

        Task<IEnumerable<City>> cities = cityDao.GetAsync(new SearchCityParametersDto("Horsens"));

        foreach (var variable in cities.Result)
        {
            Assert.That(variable.Name, Is.EqualTo("Horsens"));
        }
    }
    
    [Test]
    public void GetAdmin() //Test that user 
    {
        IUserDao userDao = new UserDAO();

        Task<User?> user = userDao.GetByUsernameAsync("bobby");

        Assert.That(user.Result.Role,Is.EqualTo("Admin"));
        
    }
}