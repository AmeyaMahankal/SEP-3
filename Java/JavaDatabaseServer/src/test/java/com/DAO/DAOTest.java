package com.DAO;

import com.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DAOTest {


    private UserDAOInterface userData=new UserDAOImpl();

    private CityDAOInterface cityData=new CityDAOImpl();

    @Test
    void userAuth() //Test that all attributes of a user are sent and can be called
    {
        User finduser = userData.selectUserWithUsername("bobby");

        assertEquals("Admin", finduser.getRole());
        assertEquals("ilikecats", finduser.getPassword());
        assertEquals(2, finduser.getId());
        assertEquals("bobby", finduser.getUsername());
    }

    @Test
    void createCity() //Test that all attributes of a user are sent and can be called
    {
        cityData.insertCity("Mumbai","coolplace","niceimage");

        City findCIty=cityData.getCityByName("Mumbai");

        assertEquals("Mumbai",findCIty.getName());
        assertEquals("coolplace",findCIty.getDescription());
        assertEquals("niceimage",findCIty.getImageURL());

        cityData.deleteCity(findCIty.getId());

    }

    @Test
    void citySearch() //Test that all attributes of a city are sent and can be called
    {
        City findCity=cityData.getCityByName("Horsens");

        assertEquals(4,findCity.getId());
        assertEquals("Horsens",findCity.getName());
        assertEquals("asfdfefqw",findCity.getDescription());
        assertEquals("photo-of-hell",findCity.getImageURL());
    }


}