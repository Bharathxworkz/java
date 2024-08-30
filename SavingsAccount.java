
public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.00; // Minimum balance

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void debit(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Debit amount exceeds minimum balance requirement.");
        } else {
            balance -= amount;
        }
    }

    @Override
    public void credit(double amount) {
        balance += amount;
    }
}
