// Task 4: Database Connectivity using Java
// 🗄️ Objective: Connect Java to MySQL and retrieve data

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/users"; // Replace 'studentdb' with your DB name
        String user = "root";  // Replace with your MySQL username
        String password = "Yousuf@180504"; // Replace with your MySQL password

        try {
            // Step 1: Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected successfully!");

            // Step 3: Create statement
            Statement stmt = con.createStatement();

            // Step 4: Execute query
            String query = "SELECT * FROM user"; // Replace 'students' with your table name
            ResultSet rs = stmt.executeQuery(query);

            // Step 5: Display results
            System.out.println("\n📋 Student Records:");
            System.out.println("---------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                String state = rs.getString("state");
                System.out.println("ID: " + id + " | Name: " + name + " | City: " + city + " | State: " + state);
            }

            // Step 6: Close connection
            con.close();
            System.out.println("\n✅ Data retrieved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
