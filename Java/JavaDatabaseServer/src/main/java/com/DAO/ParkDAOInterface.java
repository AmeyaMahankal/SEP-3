package com.DAO;

import com.model.Park;

import java.util.List;

public interface ParkDAOInterface {

    public void insertPark(String name, String description, String imageUrl, int cityId);
    public Park getParkById(int ParkId);
    public void updateParkName(String name, int id);
    public void updateParkDescription(String description, int id);
    public void deletePark(int id);
    public List<Park> listOfParks(int cityId);

}
