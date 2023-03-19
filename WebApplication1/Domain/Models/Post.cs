namespace Domain.Models;

public class Post
{
    public int Id { get; set; }

    public User Poster { get; }
    
    public string PostTitle { get; set; }
    
    public string PostBody { get; set; }

    public Post(User poster, string postTitle, string postBody)
    {
        Poster = poster;
        PostTitle = postTitle;
        PostBody = postBody;
    }
}