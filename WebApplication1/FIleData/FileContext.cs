using System.Text.Json;
using Domain.Models;

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
    
    public ICollection<City> Cities
    {
        get
        {
            LoadData();
            return dataContainer!.CitiesSAF;
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
    
    


    private void LoadData()
    {
        if (dataContainer!=null) return;

        if (!File.Exists(filepath))
        {
            dataContainer = new()
            {
             
                Users = new List<User>(),
                CitiesSAF = new List<City>(),  
                Reviews = new List<Review>(),
                Reports = new List<Report>()
                
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