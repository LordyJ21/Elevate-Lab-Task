package LibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample data
        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "Data Structures", "Mark Allen"));
        lib.addUser(new User(101, "Alice"));
        lib.addUser(new User(102, "Bob"));

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    lib.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    lib.issueBook(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
