import java.sql.*;

public class query1 {
    private static final String url = "jdbc:mysql://localhost:3306/main";
    private static final String username = "root";
    private static final String password = "9019633098";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = "SELECT name, MAX(score) AS max_score FROM batsman GROUP BY name ORDER BY max_score ASC";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int score = resultSet.getInt("max_score");
                System.out.println("The batsman name: " + name);
                System.out.println("The batsman total runs: " + score);
                System.out.println("****************************");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
