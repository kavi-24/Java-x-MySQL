// Import libraries for MySQL
import java.sql.*;

public class select_from_table {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /*
            In general Class.forName is used to load the class dynamically where we doesn’t know the class name before hand.
            Once the class is loaded we will use newInstance () method to create the object dynamically
            */
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "master"
            );
            Statement stmt = conn.createStatement();
            ResultSet rSet = stmt.executeQuery("select * from emp");
            while (rSet.next()) {
                System.out.println(rSet.getInt(1) + " " + rSet.getString(2) + " " + rSet.getInt(3));
            }
            conn.close();
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
