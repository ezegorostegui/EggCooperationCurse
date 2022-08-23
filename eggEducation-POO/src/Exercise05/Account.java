package Exercise05;

import javax.swing.*;

public class Account {
    private int accountNumber;
    private int dni;
    private int balance;
    private double interest;

    public Account(){}
    public Account(int accountNumber, int dni, int balance, double interest){
        this.accountNumber = accountNumber;
        this.dni = dni;
        this.balance = balance;
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", dni=" + dni +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}
