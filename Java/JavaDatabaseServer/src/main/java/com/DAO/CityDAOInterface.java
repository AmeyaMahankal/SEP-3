package com.DAO;

import com.model.City;

import java.util.ArrayList;

public interface CityDAOInterface {
    public ArrayList<City> getCities(String contain);
    public void insertCity(String name, String description, String imageUrl);
    public City getCityByName(String CityName);
    public City getCityById(int CityId);
    public void updateCityName(String name, int id);
    public void updateCityDescription(String description, int id);
    public void deleteCity(int id);

}
