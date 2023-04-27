using System.ComponentModel.DataAnnotations;
using System.Text.Json;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;
using FileData;
using FileData.DAOs;

namespace WebApplication1.Services;

public class AuthService : IAuthService
{

    private const string filepath = "data.json";
    private DataContainer? dataContainer;

    private void LoadData()
    {
        if (dataContainer!=null) return;

        if (!File.Exists(filepath))
        {
            dataContainer = new()
            {
              
                Users = new List<User>()
            };
            return;
        }

        string content = File.ReadAllText(filepath);
        dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
    }

    public IList<User> jusers
    {
        
        get
        {
            dataContainer = new()
            {
            
                Users = new List<User>()
            };
            string content = File.ReadAllText(filepath);
            dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
            return (IList<User>)dataContainer.Users;
        }
    }
    
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
        User? existinguser = jusers.FirstOrDefault(u =>
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