package com.xworkz.jdbc.dao;

import com.xworkz.jdbc.dto.Newspaperdto;
import com.xworkz.jdbc.exception.DataNotFoundException;
import com.xworkz.jdbc.exception.NameNotFoundException;

import java.sql.*;

public class NewspaperdaoImpl implements Newspaperdao {
    private static final String url = "jdbc:mysql://localhost:3306/me";
    private static final String userName = "root";
    private static final String password = "9019633098";

    @Override
    public void getAllNewspaper() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);

            String countQuery = "SELECT COUNT(*) FROM newspaper";
            PreparedStatement countStmt = connection.prepareStatement(countQuery);
            ResultSet countResultSet = countStmt.executeQuery();

            int count = 0;
            if (countResultSet.next()) {
                count = countResultSet.getInt(1);
            }

            if (count == 0) {
                throw new DataNotFoundException("No newspapers found in the database.");
            }

            Newspaperdto[] newspapers = new Newspaperdto[count];

            String query = "SELECT * FROM newspaper";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            int index = 0;
            while (resultSet.next()) {
                newspapers[index++] = new Newspaperdto(
                        resultSet.getInt("id"),
                        resultSet.getString("paperName"),
                        resultSet.getInt("noOfpages"),
                        resultSet.getString("language"),
                        resultSet.getInt("price"),
                        resultSet.getString("editorName"),
                        resultSet.getString("date"),
                        resultSet.getInt("noOfArticle")
                );
            }

            for (Newspaperdto newspaper : newspapers) {
                System.out.println(newspaper);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Newspaperdto getNewsPaperByDate(String date) throws DataNotFoundException {
        Newspaperdto newspaper = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT * FROM newspaper WHERE date = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, date);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                newspaper = new Newspaperdto(
                        resultSet.getInt("id"),
                        resultSet.getString("paperName"),
                        resultSet.getInt("noOfpages"),
                        resultSet.getString("language"),
                        resultSet.getInt("price"),
                        resultSet.getString("editorName"),
                        resultSet.getString("date"),
                        resultSet.getInt("noOfArticle")
                );
            } else {
                throw new DataNotFoundException("No newspaper found for the given date: " + date);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newspaper;
    }

    @Override
    public Newspaperdto getNewsPaperByLang(String lang) throws DataNotFoundException {
        Newspaperdto newspaper = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT * FROM newspaper WHERE language = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                newspaper = new Newspaperdto(
                        resultSet.getInt("id"),
                        resultSet.getString("paperName"),
                        resultSet.getInt("noOfpages"),
                        resultSet.getString("language"),
                        resultSet.getInt("price"),
                        resultSet.getString("editorName"),
                        resultSet.getString("date"),
                        resultSet.getInt("noOfArticle")
                );
            } else {
                throw new DataNotFoundException("No newspaper found for the language: " + lang);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newspaper;
    }

    @Override
    public Newspaperdto getNewsPaperById(int id) throws NameNotFoundException {
        Newspaperdto newspaper = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT * FROM newspaper WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                newspaper = new Newspaperdto(
                        resultSet.getInt("id"),
                        resultSet.getString("paperName"),
                        resultSet.getInt("noOfpages"),
                        resultSet.getString("language"),
                        resultSet.getInt("price"),
                        resultSet.getString("editorName"),
                        resultSet.getString("date"),
                        resultSet.getInt("noOfArticle")
                );
            } else {
                throw new NameNotFoundException("No newspaper found with the given ID: " + id);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newspaper;
    }

    @Override
    public int getPaperNofPagesByLanguage(String lang) throws DataNotFoundException {
        int noOfPages = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT SUM(noOfpages) FROM newspaper WHERE language = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                noOfPages = resultSet.getInt(1);
            } else {
                throw new DataNotFoundException("No newspapers found for the language: " + lang);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return noOfPages;
    }

    @Override
    public int getNoOfArticlesById(int id) throws NameNotFoundException {
        int articleCount = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT noOfArticle FROM newspaper WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                articleCount = resultSet.getInt("noOfArticle");
            } else {
                throw new NameNotFoundException("No articles found for newspaper ID: " + id);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articleCount;
    }

    @Override
    public String getDateById(int id) throws NameNotFoundException {
        String date = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT date FROM newspaper WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                date = resultSet.getString("date");
            } else {
                throw new NameNotFoundException("No date found for newspaper ID: " + id);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public void updateNoOfArticlesByDate(String date, int newArticleCount) throws DataNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "UPDATE newspaper SET noOfArticle = ? WHERE date = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, newArticleCount);
            preparedStatement.setString(2, date);
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated == 0) {
                throw new DataNotFoundException("No newspaper found with the given date: " + date);
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteNewsPaperById(int id) throws NameNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "DELETE FROM newspaper WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted == 0) {
                throw new NameNotFoundException("No newspaper found with the given ID: " + id);
            } else {
                System.out.println("Newspaper with ID " + id + " deleted successfully.");
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPaperNameByLang(String lang) throws DataNotFoundException {
        String paperName = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT paperName FROM newspaper WHERE language = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                paperName = resultSet.getString("paperName");
            } else {
                throw new DataNotFoundException("No newspaper found for the language: " + lang);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paperName;
    }

    @Override
    public String getPaperNameById(int id) throws NameNotFoundException {
        String paperName = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "SELECT paperName FROM newspaper WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                paperName = resultSet.getString("paperName");
            } else {
                throw new NameNotFoundException("No newspaper found with the given ID: " + id);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paperName;
    }

}
