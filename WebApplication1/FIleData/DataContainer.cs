using Domain.Models;

namespace FileData;

public class DataContainer
{
    
    public ICollection<City> Cities { get; set; }
    public ICollection<User> Users { get; set; }
  public ICollection<Review> Reviews { get; set; }
    public ICollection<Report> Reports { get; set; }
}