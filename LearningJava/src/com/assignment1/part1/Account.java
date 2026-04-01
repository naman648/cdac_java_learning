package com.assignment1.part1;
//
//2. Design Account Hierarchy with following specifications:
//
//        - The account class has account no, name and balance
//- Implement withdraw and deposit methods in the class
//
//- Create Savings and Current as subclasses of Account class
//
//For Savings account min balance of 10000 should be maintained while withdrawal
//
//For current account maximum of 50000 rs can be withdrawn at a time
//
//While deposit in saving max limit is 1 lakh and for current it is 5 lakh

public abstract class Account {
    private int accountno;
    private String name;
    private double balance;

    public  Account(int accountno,String name,double balance){
        this.accountno=accountno;
        this.name=name;
        this.balance=balance;
    }
    public abstract double  withdraw(double amt);
    public abstract double deposit(double amt);

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public String toString() {
        return "Account{" +
                "accountno=" + accountno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
