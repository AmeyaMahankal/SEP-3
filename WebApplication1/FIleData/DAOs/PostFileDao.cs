using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace FileData.DAOs;

public class PostFileDao: IPostDao
{
    private readonly FileContext context;

    public PostFileDao(FileContext context)
    {
        this.context = context;
    }
    
    public Task<Post> CreateAsync(Post post)
    {
        int id = 1;
        if (context.Posts.Any())
        {
            id = context.Posts.Max(t => t.Id);
            id++;
        }

        post.Id = id;
        context.Posts.Add(post);
        context.SaveChanges();
        return Task.FromResult(post);
    }

    public Task<IEnumerable<Post>> GetAsync(SearchPostParametersDto dto)
    {
        IEnumerable<Post> result = context.Posts.AsEnumerable();
        if (!string.IsNullOrEmpty(dto.username))
        {
            result = context.Posts.Where(post =>
                post.Poster.UserName.Equals(dto.username, StringComparison.OrdinalIgnoreCase));
        }

        if (dto.UserId!=null)
        {
            result = result.Where((t => t.Poster.Id == dto.UserId));
        }

        if (!string.IsNullOrEmpty(dto.TitleContains))
        {
            result = result.Where(t => t.PostTitle.Contains(dto.TitleContains, StringComparison.OrdinalIgnoreCase));
        }

        return Task.FromResult(result);
    }

    public Task<Post?> GetByIdAsync(int postId)
    {
        Post? existing = context.Posts.FirstOrDefault(post => post.Id == postId);
        return Task.FromResult(existing);
    }

    public Task DeleteAsync(int id)
    {
        Post? existing = context.Posts.FirstOrDefault(post => post.Id == id);
        if (existing==null)
        {
            throw new Exception($"Post with id {id} does not exist!");
        }

        context.Posts.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
}