package JMySQL.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExp {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/myprocedure";
        String username = "root";
        String password = "admin";

        // Create connection, statement, and result set objects
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // Execute the query
            String query = "SELECT * FROM products";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                String productCode = resultSet.getString("productCode");
                String productName = resultSet.getString("productName");
                String productLine = resultSet.getString("productLine");

                // Do something with the retrieved data
                System.out.println("ProductCode: " + productCode + ", Name: " + productName + ", Line: " + productLine);
            }

            // Close the result set
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}