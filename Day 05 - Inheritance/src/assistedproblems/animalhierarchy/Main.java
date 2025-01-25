package assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args){
        // Creating instances of the subclasses
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Chirpy", 1);

        // Calling the makeSound method on each instance
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
