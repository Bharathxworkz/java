
public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -500.00; // Overdraft limit

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void debit(double amount) {
        if (balance - amount < OVERDRAFT_LIMIT) {
            System.out.println("Debit amount exceeds overdraft limit.");
        } else {
            balance -= amount;
        }
    }

    @Override
    public void credit(double amount) {
        balance += amount;
    }
}
