package com.DAO;

import com.model.User;

import java.util.ArrayList;

public interface UserDAOInterface {
    public void insertUser(String username, String password, String role);
    public User selectUserWithUsername(String Username);
    public User selectUserWithId(int id);
    public ArrayList<User> getUsersWithString(String contain);

}
