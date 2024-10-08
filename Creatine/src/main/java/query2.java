import java.sql.*;

public class query2 {
    private  static final String url="jdbc:mysql://localhost:3306/main";
    private  static final  String Usernmae="root";
    private  static final String password="9019633098";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url,Usernmae,password);
            Statement statement=connection.createStatement();
            String query="SELECT name from batsman";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String name=resultSet.getString("name");

                System.out.println("The batsman jersey number :"+name);

                System.out.println("****************************");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
