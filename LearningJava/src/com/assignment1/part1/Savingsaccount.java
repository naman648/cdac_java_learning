package com.assignment1.part1;

public class Savingsaccount extends Account{

    public  Savingsaccount(int accountno,String name,double balance){
        super(accountno,name,balance);

    }

    @Override
   public double withdraw(double amt){
        if(this.getBalance()>10000){
            this.setBalance(this.getBalance()-amt);
            return this.getBalance();
        }
        return -1;
    }

    @Override
    public double deposit(double amt) {
        if(amt>100000){
            return -1;
        }
        this.setBalance(this.getBalance()+amt);
        return this.getBalance();
    }
}
