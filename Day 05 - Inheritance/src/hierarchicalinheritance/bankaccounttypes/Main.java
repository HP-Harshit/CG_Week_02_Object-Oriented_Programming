package hierarchicalinheritance.bankaccounttypes;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 2000.0, 500.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD789", 5000.0, 1990);

        // Calling the displayType, and accountDetails method on each instance
        savingsAccount.displayType();
        savingsAccount.displayAccountDetails();
        System.out.println();

        checkingAccount.displayType();
        checkingAccount.displayAccountDetails();
        System.out.println();

        fixedDepositAccount.displayType();
        fixedDepositAccount.displayAccountDetails();
    }
}
