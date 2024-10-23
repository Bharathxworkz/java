import java.sql.*;

public class Excel {
    // Instead of MySQL database, we use the ODBC DSN (Data Source Name)
    private static final String url = "C:\\Users\\P\\Desktop";  // Replace 'ExcelDSN' with your ODBC Data Source Name

    public static void main(String[] args) {
        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Establish the connection to Excel via ODBC
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();

            // SQL query to read data from Excel file
            String query = "SELECT * FROM [Sheet1$]";  // Replace 'Sheet1' with your sheet name
            ResultSet resultSet = statement.executeQuery(query);

            // Iterate through the result set (Excel data)
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String director = resultSet.getString("director");
                String language = resultSet.getString("language");

                // Print the movie details
                System.out.println("The movie id: " + id);
                System.out.println("The movie name: " + name);
                System.out.println("The movie director: " + director);
                System.out.println("The movie language: " + language);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
