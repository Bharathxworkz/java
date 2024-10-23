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

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);

            String query = "INSERT INTO roommates(name, age, profesional, salary) VALUES (?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the name of the roommate:");
                String name = scanner.next();
                scanner.nextLine();

                System.out.println("Enter the age of the roommate:");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the profession of the roommate:");
                String profesional = scanner.nextLine();

                System.out.println("Enter the salary of the roommate:");
                int salary = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter more data (Y/N):");
                String choice = scanner.next();

                // Set values in PreparedStatement
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setString(3, profesional);
                preparedStatement.setInt(4, salary);
                preparedStatement.addBatch();  // Corrected: No need to pass the query again

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            // Execute the batch
            int[] arr = preparedStatement.executeBatch();

            // Check the status of each query execution
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("QUERY " + (i + 1) + " not executed successfully");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
              if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
