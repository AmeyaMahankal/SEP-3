using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IPostService
{
    Task CreateAsync(CityCreationDto dto);
    Task<IEnumerable<City>?> GetPosts(string? postTitalContains = null);

    Task DeleteAsync(int postId);
}