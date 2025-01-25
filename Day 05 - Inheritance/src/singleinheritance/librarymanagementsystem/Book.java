package singleinheritance.librarymanagementsystem;

public class Book {
    // Class Attributes
    public String title;
    public int publicationYear;

    // Defining Constructor
    public Book(String title, int publicationYear) {
        // Initializing the attributes
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
