public class Book {
    public static void main(String[] args) {
        // Create an object of BookClass
        BookClass book = new BookClass();

        // Set the book details using setter methods
        book.setTitle("Java Programming");
        book.setAuthor("John Smith");
        book.setPrice(49.99);

        // Display the book details
        System.out.println("=== Book Details ===");
        book.displayBookDetail();
    }
}

class BookClass {
    // Attributes for book title, author, and price
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookClass() {
    }

    // Setter method to set the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Setter method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetail() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
