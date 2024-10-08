import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/me";
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
            String query = String.format("INSERT INTO roommates(name, age,profesional, salary) VALUES (?,?,?,?,?)");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the name of roommate:");
                String name = scanner.next();
                scanner.nextLine();
                System.out.println("Enter age of roommate:");
                int age=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the profesional roommate");
                String profesional=scanner.nextLine();

                System.out.println("Enter the salary of roommate:");
                int salary = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter more data (Y/N):");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
                preparedStatement.setString(1,name);
                preparedStatement.setInt(2,age);
                preparedStatement.setString(3,profesional);
                preparedStatement.setInt(4,salary);
                preparedStatement.addBatch(query);

            }

            int[] arr = preparedStatement.executeBatch();


            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==0)
                {
                    System.out.println("QUERY" + i + "not executed  sucessfully");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
