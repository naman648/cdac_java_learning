package com.assignment1.part1;

public class VehcileImpl {

    public static void main(String[] args){
        TwoWheeler tw=new TwoWheeler("TW01" ,2024 ,"Ducati", 250000);
        System.out.println(tw.toString());

        FourWheeler fw=new FourWheeler("FW01",2026, "Tata Harrier", 4500000);
        System.out.println(fw.toString());
        }
    }
