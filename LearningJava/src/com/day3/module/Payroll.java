package com.day3.module;
import java.time.Month;
import java.util.Scanner;

import com.day2.module.Employee;
import com.day2.module.SalariedEmployee;

public class Payroll {
    static Scanner sc = new Scanner(System.in);

    public static  void showGross(Employee e)
    {
//        System.out.println("Enter month (3 letters): ");
//        String m = sc.next();
//        Month month = Month.valueOf(m.toUpperCase());
//        System.out.println("Gross Salary of "+month + ":" + e.calculateGross());
        System.out.println("Gross Salary :" + e.calculateGross());
    }

    public static void showNet(SalariedEmployee e)
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month (3 letters) : ");
//        String m = sc.next();
//        Month month = Month.valueOf(m.toUpperCase());
//        System.out.println("Net Salary for" +month+ " : " + e.calculateNet());
          System.out.println("Net Salary : " + e.calculateNet());
    }
}
