using System.Reflection.Metadata;
using Application.DaoInterfaces;
using Domain.Models;

namespace FileData.DAOs;

public class UserFileDao: IUserDao
{
    private readonly FileContext context;

    public UserFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<User> CreateAsync(User user)
    {
        int Id = 1;
        if (context.Users.Any())
        {
            Id = context.Users.Max(u => u.Id);
            Id++;
        }

        user.Id = Id;
        context.Users.Add(user);
        context.SaveChanges();
        return Task.FromResult(user);
    }

    public Task<User?> GetByUsernameAsync(string userName)
    {
        User? existing =
            context.Users.FirstOrDefault(u => u.UserName.Equals(userName, StringComparison.OrdinalIgnoreCase));
        return Task.FromResult(existing);
    }
    
}