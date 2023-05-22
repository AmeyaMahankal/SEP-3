package com.DAO;

import com.model.Museum;

import java.util.List;

public interface MuseumDAOInterface {

    public void insertMuseum(String name, String description, String imageUrl, int cityId);
    public Museum getMuseumyById(int MuseumId);
    public void updateMuseumName(String name, int id);
    public void updateMuseumDescription(String description, int id);
    public void deleteMuseum(int id);
    public List<Museum> listOfMuseums(int cityId);

}
