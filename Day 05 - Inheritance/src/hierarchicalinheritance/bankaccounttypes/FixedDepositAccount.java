package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
    // Class Attribute
    public double interestRate;

    // Defining Constructor
    public FixedDepositAccount(String accountNumber, double balance, double interestRate) {
        // Calling the superclass constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayType() {
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
