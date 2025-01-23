import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter ISBN: ");
        String ISBN = input.nextLine();
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter author name: ");
        String author = input.nextLine();

        // Create a Book object
        Book book = new Book(ISBN, title, author);

        // Checking instanceof
        System.out.println("\nIs \"book\" is an object of \"Book\" class? "
                + (book instanceof Book ? "Yes" : "No"));

        // Ask user input for library name
        System.out.print("\nEnter the library name: ");
        String name = input.nextLine();

        // Set Library name
        Book.setLibraryName(name);

        // Display book and library detail
        System.out.println("\n=== Book Details ===");
        Book.displayLibraryName();
        book.displayBookDetails();

        // Closing the Scanner object
        input.close();
    }
}

class Book {
    // Attributes
    final public String ISBN;
    protected String title;
    private String author;
    static String libraryName;

    // Parameterized Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for libraryName
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Method to display library name
    static public void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}