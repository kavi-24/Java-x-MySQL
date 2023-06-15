import java.sql.*;

public class create_table {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test2";
        String uname = "root";
        String pass = "master";
        
        try (Connection conn = DriverManager.getConnection(url, uname, pass)) {
            Statement stmt = conn.createStatement();
            String cmd = "CREATE TABLE EMP (ID INT, NAME TEXT, AGE INT);";
            stmt.executeUpdate(cmd);
            System.out.println("Table emp created successfully...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
