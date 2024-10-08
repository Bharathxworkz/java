import java.sql.*;

public class jdbc {
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
            String query="SELECT * from batsman";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int score = resultSet.getInt("score");
                int highestscore=resultSet.getInt("highestscore");
                int centurys=resultSet.getInt("centurys");
                System.out.println("The batsman jersey number :"+id);
                System.out.println("The batsman name:"+name);
                System.out.println("The batsman total runs:"+score);
                System.out.println("The batsman highest score:"+highestscore);
                System.out.println("The batsman total centurys :"+centurys);
                System.out.println("****************************");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
