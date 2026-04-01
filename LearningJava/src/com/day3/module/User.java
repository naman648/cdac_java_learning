package com.day3.module;

import com.day2.module.Employee;
import com.day2.module.Manager;
import com.day2.module.SalariedEmployee;


public class User {
    public static void main(String[] args){
        SalariedEmployee se =new SalariedEmployee(101, "Ananya",54000);
        Payroll.showGross(se);
        Payroll.showNet(se);

        Employee e=new Manager(322, "Akshaada",340000,3455);
        Payroll.showGross(e);
        Payroll.showNet((SalariedEmployee) e);

        Employee[] emps=new Employee[2];
        emps[0]=new SalariedEmployee(450,"ss",50000);
        emps[1]=new Manager(7867, "mmm",90000,25000);

        for(Employee emp : emps){
            System.out.println(emp.toString());
            Payroll.showGross(e);
            if(emp instanceof SalariedEmployee){
                Payroll.showNet((SalariedEmployee)emp);
            }
        }
    }
}
