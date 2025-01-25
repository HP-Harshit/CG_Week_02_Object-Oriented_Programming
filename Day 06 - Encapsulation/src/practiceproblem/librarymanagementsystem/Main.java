package practiceproblem.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B123", "Big Data", "Alice"));
        items.add(new Magazine("M123", "Maths", "Bob"));
        items.add(new DVD("D123", "Data Structure", "Charlie"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println();

            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem();
                System.out.println("Availability: " + (((Reservable) item).checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println();
        }
    }
}

