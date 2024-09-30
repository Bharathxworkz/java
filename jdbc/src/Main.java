import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/me";
    private static final String userName = "root";
    private static final String password = "9019633098";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Correct Driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the name of roommate:");
                String name = scanner.nextLine();
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

                // Correcting query and using user input
                String query = String.format("INSERT INTO roommates(name, age,profesional, salary) VALUES ('%s', %d,'%s', %d)", name, age,profesional, salary);
                statement.addBatch(query);

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            int[] arr = statement.executeBatch(); // Execute all batched queries


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
