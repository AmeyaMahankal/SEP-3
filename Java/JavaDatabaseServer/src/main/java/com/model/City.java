package com.model;

public class City {


    private int Id ;
    private String Name;
    private String Description ;
    private String ImageURL;


    public City(int id, String name, String description, String imageURL) {
        Id = id;
        Name = name;
        Description = description;
        ImageURL = imageURL;
    }


    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageURL() {
        return ImageURL;
    }

    @Override
    public String toString() {
        return "City{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", ImageURL='" + ImageURL + '\'' +
                '}';
    }
}
