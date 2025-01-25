package multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends Course{
    // Class Attributes
    public double fee;
    public double discount;

    // Defining Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
                            double discount) {
        // Calling the superclass constructor
        super(courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate discounted fee
    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: $" + calculateDiscountedFee());
    }
}
