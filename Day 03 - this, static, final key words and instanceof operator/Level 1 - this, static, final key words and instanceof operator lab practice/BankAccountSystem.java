import java.util.Scanner;

public class BankAccountSystem {
	public static void main(String[] args) {
		// Create a scanner class object
		Scanner input = new Scanner(System.in);

		// Ask for user input
		System.out.print("Enter the account holder name: ");
		String accountHolder = input.nextLine();
		System.out.print("Enter the account number: ");
		int accountNumber = input.nextInt();
		input.nextLine();

		// Create object of BankAccount class
		BankAccount account = new BankAccount(accountHolder, accountNumber);

		// Check for the instanceof
		System.out.println("\nIs \"account\" object an instance of BankAccount class? "
				+ (account instanceof BankAccount ? "Yes" : "No"));

		// Updating bank name
		System.out.print("\nEnter the bank name: ");
		String name = input.nextLine();

		BankAccount.setBankName(name);

		// Displaying details
		account.displayAccountDetail();
		System.out.println("\nThe total number of accounts is: " + BankAccount.getTotalAccounts());

		// Closing scanner class object
		input.close();
	}
}

class BankAccount {
	// Attributes
	static String bankName;
	static int totalAccounts = 0;
	String accountHolder;
	final int accountNumber;

	// Parameterized Constructor
	public BankAccount(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}

	// Setter for bankName
	static public void setBankName(String name) {
		bankName = name;
	}

	// Method to get total accounts count
	static public int getTotalAccounts() {
		return totalAccounts;
	}

	// Method to display detail
	public void displayAccountDetail() {
		System.out.println("\n=== Account Details ===");
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
	}
}
