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

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the name:");
                String name = scanner.nextLine();
                System.out.println("Enter the age:");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume the newline
                System.out.println("Enter the profession:");
                String profesional = scanner.nextLine();
                System.out.println("Enter the salary:");
                int salary = scanner.nextInt();
                scanner.nextLine();  // Consume the newline

                // SQL query with inserted values
                String query = String.format("INSERT INTO roommates (name, age, profesional, salary) VALUES ('%s', %d, '%s', %d)", name, age, profesional, salary);

                // Add query to the batch
                statement.addBatch(query);

                System.out.println("Do you want to enter more data? (Y/N):");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            // Execute the batch
            int[] arr = statement.executeBatch();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == Statement.EXECUTE_FAILED) {
                    System.out.println("Query " + (i + 1) + " failed to execute.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
