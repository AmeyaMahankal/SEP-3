package com.model;

public class Hotel {
    private int id;
    private String name;
    private String Description;
    private String imageURL;
    private int cityId;

    public Hotel(int id, String name, String description, String imageURL, int cityId) {
        this.id = id;
        this.name = name;
        Description = description;
        this.imageURL = imageURL;
        this.cityId = cityId;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getCityId() {
        return cityId;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
