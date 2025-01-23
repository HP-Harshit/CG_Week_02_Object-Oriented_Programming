import java.util.Scanner;

// Base Class
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Default Constructor
    public BankAccount() {
    }

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Sub-Class SavingsAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        System.out.println("\n=== Savings Account Details ===");
        super.displayAccountDetails();
    }

    // Method to demonstrate access to accountNumber and accountHolder
    public void accessAccountDetails() {
        System.out.println("Accessing Account Number: " + accountNumber); // Public member
        System.out.println("Accessing Account Holder: " + accountHolder); // Protected member
    }
} 

// Main Class
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = input.nextLine();
        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();
        input.nextLine();

        // Create a BankAccount object
        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
        System.out.println("\n=== Bank Account Details ===");
        account.displayAccountDetails();

        // Modify and access the balance using public method
        System.out.println("\nEnter the new balance: ");
        int newBalance = input.nextInt();
        account.setBalance(newBalance);
        System.out.println("Modified Balance: $" + account.getBalance());

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, balance);
        savingsAccount.displayAccountDetails();

        // Demonstrate access to accountNumber and accountHolder in SavingsAccount class
        System.out.println("\nDemonstrating access modifiers in SavingsAccount class:");
        savingsAccount.accessAccountDetails();

        // Closing the Scanner object
        input.close();
    }
}
