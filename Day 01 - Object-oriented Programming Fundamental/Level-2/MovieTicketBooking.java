public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create an object of class MovieTicket
        MovieTicket movieTicket = new MovieTicket();

        // Set the movie name using the setter method
        movieTicket.setMovieName("Marco");

        // Book a ticket
        movieTicket.bookTicket(2, 100);

        // Display the ticket details
        movieTicket.displayTicket();
    }
}

class MovieTicket {
    // Attributes for movieName, seatNumber, and price
    private String movieName;
    private int seatNumber;
    private double price;

    // Default constructor
    public MovieTicket() {
    }

    // Setter method to set the movie name
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(int seatNumber, double price) {
        // Check for the valid seat number and price
        if (seatNumber <= 0 || price < 0) {
            System.out.println("Invalid seat number or price.");
            return;
        }
        // Assign the seat number Update the price
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display the details of the ticket
    public void displayTicket() {
        System.out.println("=== Ticket Details ===");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
