﻿namespace SEP3lu;

public class City

{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public City (int id, string name, string description)
    {
        Id = id;
        Name = name;
        Description = description;
    }

  
}