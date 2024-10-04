import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Book> books = new ArrayList<>();
    public static List<Admin> adminList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Alisher Navoiy", "Toshkent");

        // admin for testing
        Admin admin = new Admin("admin", "admin123");
        adminList.add(admin);

        System.out.println("Welcome to NUU library");
        System.out.println("1. Login as ADMIN");
        System.out.println("2. Login as Librarian");
        System.out.println("3. Login as Member");
        System.out.println("4. Continue as Guest");
        System.out.println("0. Exit");

        int choice = scanner.nextInt(); // Get user choice
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter Admin Name:");
                String name = scanner.nextLine();

                System.out.println("Enter Admin Password:");
                String password = scanner.nextLine();

                if (validateAdminLogin(name, password)) {
                    System.out.println("Admin logged in successfully!");
                    // Proceed with admin functionalities
                } else {
                    System.out.println("Invalid credentials, please try again.");
                }
                break;
            case 2:
                System.out.println("Logging in as Librarian...");
                break;
            case 3:
                System.out.println("Logging in as Member...");
                break;
            case 4:
                System.out.println("Continuing as Guest...");
                break;
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to validate admin login credentials
    public static boolean validateAdminLogin(String name, String password) {
        for (Admin admin : adminList) {
            if (admin.getName().equals(name) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
