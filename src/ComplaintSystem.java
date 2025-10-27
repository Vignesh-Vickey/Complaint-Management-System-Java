import java.sql.*;
import java.util.Scanner;

public class ComplaintSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/complaint_db";
    private static final String USER = "root";
    private static final String PASSWORD = "1243";

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static void addComplaint(String name, String complaintText) {
        String sql = "INSERT INTO complaints (name, complaint_text) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, complaintText);
            stmt.executeUpdate();
            System.out.println("✅ Complaint added successfully!\n");
        } catch (SQLException e) {
            System.out.println("❌ Error adding complaint: " + e.getMessage());
        }
    }

    private static void viewComplaints() {
        String sql = "SELECT * FROM complaints";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n📋 List of Complaints:");
            System.out.println("------------------------------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Complaint: " + rs.getString("complaint_text"));
                System.out.println("------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error viewing complaints: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Complaint Management System ===");
            System.out.println("1. Add Complaint");
            System.out.println("2. View Complaints");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your complaint: ");
                    String complaint = sc.nextLine();
                    addComplaint(name, complaint);
                }
                case 2 -> viewComplaints();
                case 3 -> {
                    System.out.println("Thanks For Your Complaint!");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid option. Try again.");
            }
        }
    }
}
