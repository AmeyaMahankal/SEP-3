using System.Text.Json;
using SEP3lu;

namespace FileData;

public class FileContext
{
    private const string filePath = "data.json";

    private DataContainer? dataContainer;

   
    public ICollection<City> Citys
    {
        get
        {
            LoadData();
            return dataContainer!.Citys;
        }
    }
    
    public ICollection<Hotel> Hotels
    {
        get
        {
            LoadData();
            return dataContainer!.Hotels;
        }
    }
    
    public ICollection<Museum> Museums
    {
        get
        {
            LoadData();
            return dataContainer!.Museums;
        }
    }
    public ICollection<Park> Parks
    {
        get
        {
            LoadData();
            return dataContainer!.Parks;
        }
    }
    public ICollection<Restaurant> Restaurants
    {
        get
        {
            LoadData();
            return dataContainer!.Restaurants;
        }
    }
    
    private void LoadData()
    {
        if (dataContainer != null) return;
        if (!File.Exists(filePath))
        {
            dataContainer = new()
            {
                Citys = new List<City>()
            };
            return;
        }

        string content = File.ReadAllText(filePath);
        dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
        
    }
    public void SaveChanges()
    {
        string serialized = JsonSerializer.Serialize(dataContainer);
        File.WriteAllText(filePath,serialized);
        dataContainer = null;
    }
}

