import java.util.ArrayList;
import java.util.List;

// Class Book
class Book {
    // Class Attributes
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }
}

// Class Library
class Library {
    // Class Attributes
    private static String libraryName;
    private List<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove book
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Method to show all books
    public void showBooks() {
        System.out.println("\n==== Books offered by " + libraryName + " ====");
        for (Book books : books) {
            System.out.println("- " + books.getTitle() + "  -  " + books.getAuthor());
        }
    }
}

// Main Class
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Object of class Library
        Library epicReads = new Library("Epic Reads");
        Library textualTreasures = new Library("Textual Treasures");

        // Object of class Book
        Book thinkingInJava = new Book("Thinking in Java", "Bruce Eckel");
        Book javaCompleteReference = new Book("Java The Complete Reference", "Herbert Schildt");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        Book theHobbit = new Book("The Hobbit", "J.R.R. Tolkien");

        // Add books to libraries
        epicReads.addBook(thinkingInJava);
        epicReads.addBook(javaCompleteReference);
        textualTreasures.addBook(harryPotter);
        textualTreasures.addBook(theHobbit);

        // Show books in libraries
        epicReads.showBooks();
        textualTreasures.showBooks();
    }
}
