package LibrarySystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add user
    public void addUser(User user) {
        users.add(user);
    }

    // Display books
    public void showBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    // Display users
    public void showUsers() {
        for (User u : users) {
            u.display();
        }
    }

    // Issue book
    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isIssued()) {
                    b.issueBook();
                    System.out.println("Book issued successfully.");
                    return;
                } else {
                    System.out.println("Book already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Return book
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                    return;
                } else {
                    System.out.println("Book was not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
}
