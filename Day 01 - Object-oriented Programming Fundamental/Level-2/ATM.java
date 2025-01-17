import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create an object for the Scanner class
        Scanner input = new Scanner(System.in);

        // Create an object of class BankAccount
        BankAccount account = new BankAccount();

        // Set the account holder's name using the setter method
        account.setAccountHolder("Harsh");
        account.setAccountNumber(34567642);
        account.setBalance(1000);

        // Perform operations on the object
        while (true) {
            // Display the menu
            System.out.println("\n\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display detail");
            System.out.println("5. Exit");
            // Get the user's choice
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            // Perform the chosen operation
            switch (choice) {
                // Deposit money into the account
                case 1:
                    // Get the amount to be deposited
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    // Deposit the amount
                    account.deposit(amount);
                    System.out.print("Updated balance: " + account.getBalance());
                    break;

                // Withdraw money from the account
                case 2:
                    // Get the amount to be withdrawn
                    System.out.print("Enter amount to Withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    // withdraw the amount
                    account.withdraw(withdrawAmount);
                    System.out.print("Updated balance: " + account.getBalance());
                    break;

                // Check the balance of the account
                case 3:
                    System.out.print("Current balance: " + account.getBalance());
                    break;

                // Display the account details
                case 4:
                    System.out.print("==== Account Details ====");
                    account.displayAccountDetails();
                    break;

                // Exit the program
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);

                // Invalid choice
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}

class BankAccount {
    // Attributes for accountHolder, accountNumber, and balance
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Default constructor
    public BankAccount() {
    }

    // Setter method to set the account holder's name
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Setter method to set the account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Setter method to set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        // Check if the deposit amount is valid
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Check if the withdrawal amount is valid
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
