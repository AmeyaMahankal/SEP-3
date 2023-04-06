using System.ComponentModel.DataAnnotations;
using Domain.Models;
using FileData;
using FileData.DAOs;

namespace WebApplication1.Services;

public class AuthService : IAuthService
{
    
    private  IList<User> users = new List<User>
    {
        new User
        {
            Id = 1,
            Password = "ilikecats",
            Role = "Admin",
            UserName = "bobby"
        },
        new User
        {
            Id = 2,
            Password = "jefffff",
            Role = "User",
            UserName = "kevin"
        }
    };
    

    public Task<User> ValidateUser(string username, string password)
    {
        User? existinguser = users.FirstOrDefault(u =>
            u.UserName.Equals(username, StringComparison.OrdinalIgnoreCase));
        
        if (existinguser == null)
        {
            throw new Exception("User not found");
        }

        if (!existinguser.Password.Equals(password))
        {
            throw new Exception("Password mismatch");
        }

        return Task.FromResult(existinguser);
    }

    public Task RegisterUser(User user)
    {
        if (string.IsNullOrEmpty(user.UserName))
        {
            throw new ValidationException("Username cannot be null");
        }

        if (string.IsNullOrEmpty(user.Password))
        {
            throw new ValidationException("Password cannot be null");
        }
        
        users.Add(user);

        return Task.CompletedTask;
    }
}