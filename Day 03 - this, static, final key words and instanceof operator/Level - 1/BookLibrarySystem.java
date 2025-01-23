import java.util.Scanner;

// Base Class
class Book {
    final public String ISBN; // Public
    protected String title; // Protected
    private String author; // Private
    static String libraryName; // Static

    // Parameterized Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for libraryName
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Method to display library name
    static public void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Sub-Class EBook
class EBook extends Book {
    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display ebook details
    @Override
    public void displayBookDetails() {
        System.out.println("\n=== E-Book Details ===");
        super.displayBookDetails();
    }

    // Method to demonstrate access to ISBN and title
    public void accessISBNAndTitle() {
        System.out.println("Accessing ISBN: " + ISBN); // Public member
        System.out.println("Accessing Title: " + title); // Protected member
    }
}

// Main Class
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
        System.out.println("Is \"book\" is an object of \"Book\" class? "
                + (book instanceof Book ? "Yes" : "No"));

        // Ask user input for library name
        System.out.print("\nEnter the library name: ");
        String name = input.nextLine();

        // Set Library name
        Book.setLibraryName(name);

        // Display book detail
        System.out.println("\n=== Book Details ===");
        Book.displayLibraryName();
        book.displayBookDetails();

        // Modify and access the author using public method
        System.out.println("\nEnter the name of new author: ");
        String newAuthor = input.nextLine();
        book.setAuthor(newAuthor);
        System.out.println("Modified Author: " + book.getAuthor());

        // Create an EBook object
        EBook eBook = new EBook(ISBN, title, author);
        eBook.displayBookDetails();

        // Demonstrate access to ISBN and title in EBook class
        System.out.println("\nDemonstrating access modifiers in EBook class:");
        eBook.accessISBNAndTitle();

        // Closing the Scanner object
        input.close();
    }
}
