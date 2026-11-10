package org.example;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Ошибка: сумма должна быть больше нуля");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть больше нуля");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств");
        } else {
            balance -= amount;
        }
    }

    public boolean isRich() {
        return balance > 100000;
    }
}
