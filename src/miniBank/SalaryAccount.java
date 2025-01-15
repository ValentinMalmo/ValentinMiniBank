package miniBank;

public class SalaryAccount extends Account {
    public SalaryAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }
}
