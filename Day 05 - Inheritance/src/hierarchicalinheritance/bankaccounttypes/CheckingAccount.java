package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{
    // Class Attribute
    public double withdrawalLimit;

    // Defining Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        // Calling the superclass constructor
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}
