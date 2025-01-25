package practiceproblem.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA123", "Alice", 5000));
        accounts.add(new CurrentAccount("CA123", "Bob", 3000));

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
        }
    }
}
