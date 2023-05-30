using System.Text.Json;
using Domain.Models;
using SEP3lu;

namespace FileData;

public class FileContext
{
    private const string filepath = "data.json";
    private DataContainer? dataContainer;
    

    public ICollection<User> Users
    {
        get
        {
            LoadData();
            return dataContainer!.Users;
        }
    }
    
    public ICollection<Review> Reviews
    {
        get
        {
            LoadData();
            return dataContainer!.Reviews;
        }
    }

    public ICollection<Report> Reports
    {
        get
        {
            LoadData();
            return dataContainer!.Reports;
        }
    }
    public ICollection<City> Cities
    {
        get
        {
            LoadData();
            return dataContainer!.Cities;
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
        if (dataContainer!=null) return;

        if (!File.Exists(filepath))
        {
            dataContainer = new()
            {
                Users = new List<User>(),  
                Reviews = new List<Review>(),
                Reports = new List<Report>(),
                Hotels = new List<Hotel>(),
                Museums = new List<Museum>(),
                Restaurants = new List<Restaurant>(),
                Parks = new List<Park>()
                
            };
            return;
        }

        string content = File.ReadAllText(filepath);
        dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
    }

    public void SaveChanges()
    {
        string serialized = JsonSerializer.Serialize(dataContainer);
        File.WriteAllText(filepath,serialized);
        dataContainer = null;
    }
}