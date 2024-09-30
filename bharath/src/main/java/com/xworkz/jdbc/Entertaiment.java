package com.xworkz.jdbc;

import java.sql.*;


public class Entertaiment {

    private static final String url = "jdbc:mysql://localhost:3306/entertaiment";
    private static final String userNmae = "root";
    private static final String password = "9019633098";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection= DriverManager.getConnection(url,userNmae,password);
            Statement statement = connection.createStatement();
            String query ="select * from Movie";
          ResultSet resultSet=statement.executeQuery(query);
                    while(resultSet.next()){
                        int id=resultSet.getInt("id");
                        String Name=resultSet.getString("Name");
                        String director=resultSet.getString("director");
                        String language=resultSet.getString("language");
                        System.out.println("The movie id:"+id);
                        System.out.println("the movie name:"+Name);
                        System.out.println("the movie director :"+director);
                        System.out.println("the movie language :"+language);
                    }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}