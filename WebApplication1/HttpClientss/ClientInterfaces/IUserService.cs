using Domain.DTOs;
using Domain.Models;

namespace HttpClientss.ClientInterfaces;

public interface IUserService
{
    Task<User> Create(UserCreationDto dto);
}