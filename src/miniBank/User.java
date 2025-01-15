package miniBank;

import java.util.ArrayList;
import java.util.List;

public class User {
    private  String personalId;
    private String pin;
   // private List<Account> acounts;
    private Account salaryAccount;
    private Account savingsAccount;


    public User(String personalId, String pin, String salaryAccountNumber, String savingsAccountNumber) {
        this.personalId = personalId;
        this.pin = pin;
        this.salaryAccount = new SalaryAccount(0.0, salaryAccountNumber); // Skapar lönekonto med saldo 0.0
        this.savingsAccount = new SavingsAccount(0.0, savingsAccountNumber); // Skapar sparkonto med saldo 0.0
    }



    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(Account salaryAccount) {
        this.salaryAccount = salaryAccount;
    }

    public Account getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(Account savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }
}
