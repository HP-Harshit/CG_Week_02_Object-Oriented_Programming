package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    // Class Attributes
    public String accountNumber;
    public double balance;

    // Defining Constructor
    public BankAccount(String accountNumber, double balance) {
        // Initializing the attributes
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
