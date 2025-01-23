import java.util.ArrayList;
import java.util.List;

// Class Account
class Account {
    // Class Attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    // Prit detail
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

// Class Customer
class Customer {
    // Class Attributes
    private String accountHolder;
    private List<Account> accounts;

    // Constructor
    public Customer(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accounts = new ArrayList<>();
    }

    // Getter for acountHolder
    public String getAccountholder() {
        return accountHolder;
    }

    // Method to openAccount
    public void openAccount(String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
    }

    // Method to viewBalance
    public void viewBalance() {
        System.out.println("\nAccounts for " + accountHolder + ": ");
        for (Account account : accounts) {
            account.printDetails();
        }
    }
}

// Class Bank
class Bank {
    // Class Attributes
    private static String bankName;
    private List<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to add Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to openAccount
    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        customer.openAccount(accountNumber, initialBalance);
    }

    // Method to show Customers
    public void showCustomerAccounts(Customer customer) {
        customer.viewBalance();
    }
}

// Main Class
public class BankAccountHolders {
    public static void main(String[] args) {
        // Object of Bank Class
        Bank bank = new Bank("Global Bank");

        // Object of Customer Class
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Add customers to Bank
        bank.addCustomer(alice);
        bank.addCustomer(bob);

        // Open the account for customers
        bank.openAccount(alice, "123456", 1000.0);
        bank.openAccount(alice, "654321", 500.0);
        bank.openAccount(bob, "789012", 1500.0);

        // Printing details
        System.out.println("\n=== Accounts in Global Bank ===");
        bank.showCustomerAccounts(alice);
        bank.showCustomerAccounts(bob);
    }
}
