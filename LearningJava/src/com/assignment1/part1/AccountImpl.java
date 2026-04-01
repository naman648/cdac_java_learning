package com.assignment1.part1;

public class AccountImpl {

    public static void main(String [] args){


        Savingsaccount sa1 = new Savingsaccount(123,"Anant",1500000);
        double s1_depo=sa1.deposit(100000);
        if(s1_depo==-1){
            System.out.println("The deposit amount should not be greater than 100000 ");
        }
        else{
            System.out.println("Amount depoisted successfully your current balance: "+sa1.getBalance());
        }

        CurrentAc ca1 = new CurrentAc(1234,"vachan",2500000);
        double ca1_depo = ca1.deposit(10000000f);
        if(ca1_depo == -1){
            System.out.println("The deposit amount should not be greater than 500000");
        }
        else{
            System.out.println("Amount depoisted successfully your current balance: "+sa1.getBalance());
        }
    }
}
