import java.sql.*;

public class ok {

    private static final String url = "jdbc:mysql://localhost:3306/main";
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
            String query = "select * from cricket1";  // corrected typo here
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String type = resultSet.getString("type");
                System.out.println("The player name: " + name);
                System.out.println("The player age: " + age);
                System.out.println("The player type: " + type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
