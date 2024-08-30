
public abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void debit(double amount);
    public abstract void credit(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Balance: $" + balance;
    }
}
