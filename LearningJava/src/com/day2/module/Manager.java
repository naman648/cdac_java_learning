package com.day2.module;

public class Manager extends SalariedEmployee{
    protected int allowance;

    public Manager(int empid,String name,double basic,int allowance){
        super(empid, name, basic);
        this.allowance=allowance;
    }

    public int getAllowance() {
        return allowance;
    }

    @Override
    public String toString() {
        return super.toString()+"Manager{" +
                "allowance=" + allowance +
                '}';
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calculateGross(){
        return super.calculateGross()+allowance;
    }

    @Override
    public double calculateNet(){
        return super.calculateGross();
    }
}
