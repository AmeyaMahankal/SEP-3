package com.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private static DAOImpl instance;

    public DAOImpl() throws SQLException
    {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static synchronized DAOImpl getInstance() throws SQLException
    {
        if (instance == null)
        {
            instance = new DAOImpl();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "1111");
    }


    @Override
    public List<Integer> getRegistrationNumbers(String product) throws SQLException {

        ArrayList<Integer> registrations= new ArrayList<>();
        try(Connection connection= getConnection()){

            PreparedStatement statement= connection.prepareStatement("Select \"animal-reg\"\n" +
                    "from \"product-list\"\n" +
                    "         join product p on p.id=\"product-list\".\"product-id\"\n" +
                    "where \"product-id\" =(\n" +
                    "    select id\n" +
                    "    from product\n" +
                    "    where name= ?\n" +
                    "    )\n" +
                    ";");

            statement.setString(1, product);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
            {
                registrations.add(resultSet.getInt("animal-reg"));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return registrations;
    }

    @Override
    public List<String> getProducts(String animal) throws SQLException {
        ArrayList<String> products= new ArrayList<>();
        try(Connection connection= getConnection()){

            PreparedStatement statement= connection.prepareStatement("Select product.name\n" +
                    "from product\n" +
                    "         join \"product-list\" pl on pl.\"product-id\"=product.id, animals\n" +
                    "where \"animal-reg\"= (\n" +
                    "    select \"reg-number\"\n" +
                    "    from animals\n" +
                    "    where animals.name= ?\n" +
                    "    )\n" +
                    "group by   product.name;");

            statement.setString(1, animal);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
            {
                products.add(resultSet.getString("name"));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return products;
    }


    public static void main(String[] args) throws SQLException {
        DAOImpl dao= new DAOImpl();
        System.out.println( dao.getRegistrationNumbers("Breast"));
        System.out.println( dao.getProducts("chicken"));
    }
}
