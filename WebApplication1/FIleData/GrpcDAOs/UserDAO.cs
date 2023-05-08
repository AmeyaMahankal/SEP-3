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
        UserGetId request = new UserGetId()
        {
            Id = dtoOwnerId
        };

        var send = client.GetByIdAsync(request);

        User user = new User()
        {
            Id = send.ResponseAsync.Result.Id,
            UserName = send.ResponseAsync.Result.Username,
            Password = send.ResponseAsync.Result.Password,
            Role = send.ResponseAsync.Result.Role
        };

        return Task.FromResult(user);
    }

    public Task<IEnumerable<User>> GetAsync(SearchUserParametersDto searchParameters)
    {
        SearchUserParameters search = new SearchUserParameters()
        {
            Usercontains = searchParameters.UsernameContains
        };

        var send = client.GetUsersContainingAsync(search);

        List<User> listofusers = new List<User>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Users)
        {
            User user = new User()
            {
                Id = VARIABLE.Id,
                UserName = VARIABLE.Username,
                Password = VARIABLE.Password,
                Role = VARIABLE.Role
            };
            
            listofusers.Add(user);
        }

        IEnumerable<User> ilistusers = listofusers;

        return Task.FromResult(ilistusers);
    }
}