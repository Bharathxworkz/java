package com.xworkz.jdbc.dao;

import com.xworkz.jdbc.dto.Moviedto;

import java.sql.*;

public class EntertamentImpl implements Entertaiment {
    private static final String url = "jdbc:mysql://localhost:3306/rayan";  // Updated database name
    private static final String userName = "root";
    private static final String password = "9019633098";

    @Override
    public void getNumberOfMOvies() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);

            String query = "select count(*) from movie";

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.println("Total movie count: " + count);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
