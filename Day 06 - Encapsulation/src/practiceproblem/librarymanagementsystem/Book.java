package practiceproblem.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
    public Book(String itemId, String title, String author){
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration(){
        return 21; // 21 days
    }
    @Override
    public void reserveItem() {
        System.out.println("Reserving book: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        // Simplified check
        return true;
    }
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}
