import java.util.Scanner;

public class LibraryBookingSystem {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner input = new Scanner(System.in);

        // Create a book object
        Book book = new Book();

        // Display the book details before borrowing
        System.out.println("=== Book Details ===");
        book.displayDetails();

        // Borrow the book
        book.borrowBook();

        // Display the book details after borrowing
        System.out.println("\n=== Updated Book Details ===");
        book.displayDetails();

        // Close the Scanner object
        input.close();
    }
}

class Book {
    // Instance Variable
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default constructor
    public Book() {
        this("Java: A Beginner's Guide", "Herbert Schildt", 199.99, true);
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean available) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setAvailability(available);
    }

    // Setter for title
    private void setTitle(String title) {
        this.title = title;
    }

    // Setter for author
    private void setAuthor(String author) {
        this.author = author;
    }

    // Setter for price
    private void setPrice(double price) {
        this.price = price;
    }

    // Setter for availability
    private void setAvailability(boolean available) {
        this.available = available;
    }

    // Getter for title
    private String getTitle() {
        return title;
    }

    // Getter for author
    private String getAuthor() {
        return author;
    }

    // Getter for price
    private double getPrice() {
        return price;
    }

    // Getter for availability
    private boolean getAvailability() {
        return available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (getAvailability()) {
            System.out.println("\nBook borrowed");
            setAvailability(false);
        } else {
            System.out.println("Book is not available");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Available: " + getAvailability());
    }
}
