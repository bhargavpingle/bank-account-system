package controller;

import model.Account;

public class BankController {
    private Account account;

    public BankController(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}
