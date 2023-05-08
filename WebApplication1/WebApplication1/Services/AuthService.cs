using System.ComponentModel.DataAnnotations;
using System.Text.Json;
using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using FileData;
using FileData.DAOs;

namespace WebApplication1.Services;

public class AuthService : IAuthService
{
    private IUserDao userDao;

    public AuthService(IUserDao userDao)
    {
        this.userDao = userDao;
    }
    
    public Task<User> ValidateUser(string username, string password)
    {
        Task<User?> user = userDao.GetByUsernameAsync(username);

        User userproper = new User()
        {
            Id = user.Result.Id,
            UserName = user.Result.UserName,
            Password = user.Result.Password,
            Role = user.Result.Role
        };
        
        if (userproper == null)
        {
            throw new Exception("User not found");
        }

        if (!userproper.Password.Equals(password))
        {
            throw new Exception("Password mismatch");
        }

        return Task.FromResult(userproper);
    }

    public Task RegisterUser(User user)
    {
        throw new NotImplementedException();
    }
}