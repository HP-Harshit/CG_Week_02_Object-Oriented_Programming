package practiceproblem.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
    private static final double interestRate = 0.04; // 4% annual interest
    public SavingsAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for loan of amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Simplified eligibility check
        return getBalance() >= 1000;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest: " + calculateInterest());
        System.out.println("Loan Eligibility: " + (calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
    }
}
