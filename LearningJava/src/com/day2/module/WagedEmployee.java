package com.day2.module;



public class WagedEmployee extends Employee {
    int wages;
    double hours;

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "WagedEmployee{" +
                "wages=" + wages +
                ", hours=" + hours +
                '}';
    }

    public WagedEmployee(int empid, String name, int wages, double hours){
        super(empid, name);
        this.wages=wages;
        this.hours=hours;

    }

    public void setWages(){

    }

    @Override
    public double calculateGross(){
        return wages*hours;
    }

}
