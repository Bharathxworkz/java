import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bharath {
    private static final String url = "jdbc:mysql://localhost:3306/me";
    private static final String userName = "root";
    private static final String password = "9019633098";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String query = "Insert into roommates('Bharath L',23,'IT',5000)";
            Scanner scanner = new Scanner(System.in);
           while (true){
                System.out.println("Enter the name");
                String name= scanner.nextLine();
                System.out.println("Enter the age");
                int age=scanner.nextInt();
                System.out.println("Enter the profrsional");
                scanner.nextLine();
                String profesional=scanner.nextLine();
                System.out.println("Enter the salary");
                int salary = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Select the choice (Y/N)");
                String choice = scanner.nextLine();
                if(choice.equalsIgnoreCase("N"))
                {
                    break;
                }


                statement.addBatch(query);

            }
            int[] arr= statement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
