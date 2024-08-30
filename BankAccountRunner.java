
public class BankAccountRunner {
    public static void main(String[] args) {
        // Create current and savings accounts
        CurrentAccount currentAccount = new CurrentAccount(1000.00);
        SavingsAccount savingsAccount = new SavingsAccount(500.00);

        // Perform operations on current account
        System.out.println("Current Account:");
        currentAccount.debit(200.00);
        System.out.println(currentAccount);
        currentAccount.credit(500.00);
        System.out.println(currentAccount);

        // Perform operations on savings account
        System.out.println("\nSavings Account:");
        savingsAccount.debit(400.00);
        System.out.println(savingsAccount);
        savingsAccount.credit(300.00);
        System.out.println(savingsAccount);
    }
}
