using Domain.Models;
using SEP3lu;

namespace FileData;

public class DataContainer
{
    public ICollection<User> Users { get; set; }
    public ICollection<City> Cities { get; set; }
    public ICollection<Post> Posts { get; set; }
    public ICollection<Review> Reviews { get; set; }
    public ICollection<Report> Reports { get; set; }
    public ICollection<Hotel> Hotels { get; set; }
    public ICollection<Museum> Museums { get; set; }
    public ICollection<Restaurant> Restaurants { get; set; }
    public ICollection<Park> Parks { get; set; }
    
    
}