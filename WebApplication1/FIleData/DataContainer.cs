using Domain.Models;

namespace FileData;

public class DataContainer
{
    public ICollection<User> Users { get; set; }
  public ICollection<City> CitiesSAF { get; set; }
    public ICollection<Review> Reviews { get; set; }
    public ICollection<Report> Reports { get; set; }
}