import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter the name of the guest:");
        String name = input.nextLine();
        System.out.println("Enter the room type:");
        String roomType = input.nextLine();
        System.out.println("Enter the number of nights the guest will stay:");
        int nights = input.nextInt();

        // Default booking
        System.out.println("\n=== Default Hotel Booking Detail ===");
        HotelBooking hotelBooking1 = new HotelBooking();
        hotelBooking1.display();

        // User-provided booking
        System.out.println("\n=== User-Provided Hotel Booking Detail ===");
        HotelBooking hotelBooking2 = new HotelBooking(name, roomType, nights);
        hotelBooking2.display();

        // Cloned booking
        System.out.println("\n=== Clone Hotel Booking Detail ===");
        HotelBooking hotelBooking3 = new HotelBooking(hotelBooking2);
        hotelBooking3.display();

        // Close the scanner object
        input.close();
    }
}

class HotelBooking {
    // Instance Variable
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Single", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        setGuestName(guestName);
        setRoomType(roomType);
        setNights(nights);
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this(booking.getGuestName(), booking.getRoomType(), booking.getNights());
    }

    // Setter for guest name
    private void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Setter for room type
    private void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Setter for nights
    private void setNights(int nights) {
        this.nights = nights;
    }

    // Getter for guest name
    private String getGuestName() {
        return guestName;
    }

    // Getter for room type
    private String getRoomType() {
        return roomType;
    }

    // Getter for nights
    private int getNights() {
        return nights;
    }

    // Method to display booking details
    public void display() {
        System.out.println("\nGuest Name: " + getGuestName());
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Number of Nights: " + getNights());
    }
}
