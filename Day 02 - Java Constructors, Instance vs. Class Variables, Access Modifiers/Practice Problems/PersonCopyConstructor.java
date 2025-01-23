import java.util.Scanner;

public class PersonCopyConstructor {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask for user input
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        // Create an original Person object
        Person person1 = new Person(name, age);
        
        // Create a clone of the original Person object using the copy constructor
        Person person2 = new Person(person1);
        
        // Display details of both Person objects
        System.out.println("\n=== Person 1 ===");
        person1.displayInfo();
        
        System.out.println("\n\n=== Person 2 (Clone of Person 1) ===");
        person2.displayInfo();
        
        // Closing the Scanner object
        input.close();
    }
}

class Person {
    // Instance Variable
    private String name;
    private int age;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Copy constructor
    public Person(Person person) {
        this(person.getName(), person.getAge());
    }

    // Setter for name
    private void setName(String name) {
        this.name = name;
    }

    // Setter for age
    private void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    private String getName() {
        return name;
    }

    // Getter for age
    private int getAge() {
        return age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
