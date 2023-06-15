import java.sql.*;
import java.util.Scanner;

public class delete_value {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test2", "root", "master");
            Statement stmt = conn.createStatement();
        ) {
            while (true) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt(1) + "; Name: " + rs.getString(2) + "; Age: " + rs.getInt(3));
                }
                System.out.print("Enter the ID to delete or -1 to exit: ");
                int id = scanner.nextInt();
                if (id == -1) break;
                else {
                    stmt.executeUpdate("dElEtE FrOm eMp wHeRe iD="+id);
                    System.out.println("Data with ID " + id + " deleted successfully...");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
