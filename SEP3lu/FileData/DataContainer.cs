using SEP3lu;

namespace FileData;

public class DataContainer
{
    public ICollection<City> Citys { get; set; }
    public ICollection<Hotel> Hotels { get; set; }
    public ICollection<Museum> Museums { get; set; }
    public ICollection<Restaurant> Restaurants { get; set; }
    public ICollection<Park> Parks { get; set; }
}