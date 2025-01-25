package singleinheritance.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Author
        Author author = new Author("The Great Book", 2025, "John Doe",
                "John Doe is an acclaimed author known for his insightful writings on modern fiction.");

        // Calling the displayInfo method on the instance
        author.displayInfo();
    }
}
