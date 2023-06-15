import java.sql.*;

public class create_db {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "master")) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE TEST2");
            System.out.println("Database Test2 Created Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
