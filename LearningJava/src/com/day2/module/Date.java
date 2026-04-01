package com.day2.module;


public class Date {
    int day;
    private Month month;
    private int year;

    public Date(int day,Month month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
