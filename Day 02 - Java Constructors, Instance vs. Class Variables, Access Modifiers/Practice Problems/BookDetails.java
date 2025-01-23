import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        // Create a Scanner Class object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter book title:");
        String title = input.nextLine();
        System.out.println("Enter book author:");
        String author = input.nextLine();
        System.out.println("Enter book price:");
        double price = input.nextDouble();

        // Create a Book object using the parameterized constructor
        Book book = new Book(title, author, price);

        // Display the book details
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

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
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

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}
