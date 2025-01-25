package practiceproblem.librarymanagementsystem;

public class DVD  extends LibraryItem implements Reservable{
    public DVD(String itemId, String title, String author){
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration(){
        return 14; // 14 days
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
