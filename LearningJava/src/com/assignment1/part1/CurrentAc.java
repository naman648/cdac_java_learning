package com.assignment1.part1;

public class CurrentAc extends Account{
    public CurrentAc(int accountno, String name, double balance) {
        super(accountno, name, balance);
    }

    @Override
    public double withdraw(double amt) {
        if(amt > 50000){
            return -1;
        }
        this.setBalance(this.getBalance()-amt);
        return this.getBalance();
    }

    @Override
    public double deposit(double amt) {
        if(amt > 500000){
            return -1;
        }
        this.setBalance(this.getBalance()+amt);
        return this.getBalance();
    }
}
