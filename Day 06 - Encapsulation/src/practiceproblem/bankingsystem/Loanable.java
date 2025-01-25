package practiceproblem.bankingsystem;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}