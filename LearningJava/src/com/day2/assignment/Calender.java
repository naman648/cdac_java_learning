package com.day2.assignment;

import java.util.Scanner;

import com.day2.module.*;

public class Calender {
    public static void main(String [] args){
        Month m = Month.MAR;
        Date d = new Date(23,m,2026);
        Date d1 = new Date(2,Month.JAN,2000);

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter month (3 letter) ");
        String month=sc.next();

        Month mm = Month.valueOf(month.toUpperCase());
        Date d2 = new Date(22,mm,2000);

        System.out.println(d1);
        System.out.println(d2);
    }
}
