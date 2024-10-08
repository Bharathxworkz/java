package com.xworkz.jdbc;

import java.sql.*;

public class Entertainment {

    private static final String url = "jdbc:mysql://localhost:3306/rayan";  // Updated database name
    private static final String userName = "root";
    private static final String password = "9019633098";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            String query = "select * from movie order by id desc";  // corrected typo here
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String director=resultSet.getString("director");
                String language=resultSet.getString("language");
                System.out.println("The movie id :"+id);
                System.out.println("The movie name :"+name);
                System.out.println("The movie director :"+director);
                System.out.println("the movie language :"+language);
            }



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

