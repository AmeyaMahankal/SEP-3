using Application.DaoInterfaces;
using DataAccessClient;
using Domain.DTOs;
using Grpc.Net.Client;
using User = Domain.Models.User;

namespace FileData.GrpcDAOs;

public class UserDAO : IUserDao
{
    private Access.AccessClient client;
    
    public UserDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }

    public Task<User> CreateAsync(User user)
    {
        UserCreate request = new UserCreate()
        {
            UserName = user.UserName,
            PassWord = user.Password
        };
        var send = client.CreateUser(request);
        
        return Task.FromResult(user);
    }

    public Task<User?> GetByUsernameAsync(string userName)
    {
        UserGetUsername request = new UserGetUsername()
        {
            Username = userName
        };

        var send = client.GetByUsernameAsync(request);
        
        User foundUser = new User()
        {
            UserName = send.ResponseAsync.Result.Username,
            Id = send.ResponseAsync.Result.Id,
            Password = send.ResponseAsync.Result.Password,
            Role = send.ResponseAsync.Result.Role
        };

        return Task.FromResult(foundUser)!;
    }

    public Task<User?> GetByIdAsync(int dtoOwnerId)
    {
        throw new NotImplementedException();
    }

    public Task<IEnumerable<User>> GetAsync(SearchUserParametersDto searchParameters)
    {
        throw new NotImplementedException();
    }
}