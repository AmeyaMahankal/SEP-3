﻿using System.Text.Json;
using Domain.Models;

namespace FileData;

public class FileContext
{
    private const string filepath = "data.json";
    private DataContainer? dataContainer;

    public ICollection<Post> Posts
    {
        get
        {
            LoadData();
            return dataContainer!.Posts;
        }
    }

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
    
    


    private void LoadData()
    {
        if (dataContainer!=null) return;

        if (!File.Exists(filepath))
        {
            dataContainer = new()
            {
                Posts = new List<Post>(),
                Users = new List<User>(),  
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