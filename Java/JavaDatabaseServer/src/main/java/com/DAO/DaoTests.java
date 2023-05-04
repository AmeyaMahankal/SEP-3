package com.DAO;

import com.model.User;

public class DaoTests {
    public static void main(String[] args) {
        DAO d=new DAO();
        //d.createNewDatabase("container");
        //dao.createUserTable();
        //d.insert("bobby","ilikecats","User");
        //d.insert("jeff","idontlikecats","User");

        //User isthere=d.selectUserWithUsername("jeff");
        //System.out.println(isthere.toString());
        //d.insert("bobby","ilikecats","Admin");
        System.out.println(d.selectUserWithId(3).getUsername());
    }
}
