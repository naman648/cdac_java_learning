package com.day2.module;

import javax.sound.midi.SysexMessage;

public class PayRoll {
    public static void main(String [] args){

        SalariedEmployee s1=new SalariedEmployee(1,"anant",50000);
        SalariedEmployee s2=new SalariedEmployee(2,"vachan",50000);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Gross "+s1.calculateGross());
        System.out.println(("Gross "+s1.calculateNet()));

        Manager me = new Manager(2433,"aaaa",60000,15000);
        System.out.println(s1);
        System.out.println("Gross "+ me.calculateGross());
        System.out.println("Gross" +me.calculateNet());

        WagedEmployee we = new WagedEmployee(344,"hero",600,7);
        System.out.println(we);
        System.out.println("Gross "+ we.calculateGross());
    }
}
