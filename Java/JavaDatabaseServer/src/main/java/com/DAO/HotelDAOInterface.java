package com.DAO;

import com.model.Hotel;
import com.model.Review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface HotelDAOInterface {

    public void insertHotel(String name, String description, String imageUrl, int cityId);
    public Hotel getHotelyById(int HotelId);
    public void updateHotelName(String name, int id);
    public void updateHotelDescription(String description, int id);
    public void deleteHotel(int id);
    public List<Hotel> listOfHotels(int cityId);

}
