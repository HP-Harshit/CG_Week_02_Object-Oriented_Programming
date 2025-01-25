package hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount{
    // Class Attribute
    public double interestRate;

    // Defining Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        // Calling the superclass constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
