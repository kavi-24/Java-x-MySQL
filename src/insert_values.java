import java.sql.*;
import java.util.Scanner;

public class insert_values {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test2", "root", "master");
            Statement stmt = conn.createStatement();
            ) {
                System.out.print("Press Y To Input Values Or N To Exit: ");
                while (scanner.next().toUpperCase().charAt(0) == 'Y') {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    stmt.executeUpdate("INSERT INTO EMP VALUES (" + id + ", '" + name + "', " + age + ");");
                    System.out.println("Data inserted successfully...");
                    System.out.print("Press Y To Input Values Or N To Exit: ");
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
