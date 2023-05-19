package com.DAO;

import com.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DAOTest {

    private DAO data = new DAO();

    @Test
    void userAuth() //Test that all attributes of a user are sent and can be called
    {
        User finduser = data.selectUserWithUsername("bobby");

        assertEquals("Admin", finduser.getRole());
        assertEquals("ilikecats", finduser.getPassword());
        assertEquals(2, finduser.getId());
        assertEquals("bobby", finduser.getUsername());
    }

    @Test
    void createCity() //Test that all attributes of a user are sent and can be called
    {
        data.insertCity("Mumbai","coolplace","niceimage");

        City findCIty=data.getCityByName("Mumbai");

        assertEquals("Mumbai",findCIty.getName());
        assertEquals("coolplace",findCIty.getDescription());
        assertEquals("niceimage",findCIty.getImageURL());

        data.deleteCity(findCIty.getId());

    }

    @Test
    void citySearch() //Test that all attributes of a city are sent and can be called
    {
        City findCity=data.getCityByName("Horsens");

        assertEquals(4,findCity.getId());
        assertEquals("Horsens",findCity.getName());
        assertEquals("asfdfefqw",findCity.getDescription());
        assertEquals("photo-of-hell",findCity.getImageURL());
    }


}