package com.database;

import java.sql.SQLException;
import java.util.List;

public interface DAO {
    List<Integer> getRegistrationNumbers(String product) throws SQLException;

    List<String> getProducts(String animal) throws SQLException;
}
