package miniBank;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
