package singleinheritance.librarymanagementsystem;

public class Author extends Book{
    // Class Attributes
    public String name;
    public String bio;

    // Defining Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        // Calling the superclass constructor
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
