package com.DAO;

import com.model.Restaurant;

import java.util.List;

public interface RestaurantDAOInterface {
    public void insertRestaurant(String name, String description, String imageUrl, int cityId);
    public Restaurant getRestaurantById(int RestaurantId);
    public void updateRestaurantName(String name, int id);
    public void updateRestaurantDescription(String description, int id);
    public void deleteRestaurant(int id);
    public List<Restaurant> listOfRestaurant(int cityId);


}
