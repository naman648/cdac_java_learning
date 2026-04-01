package com.assignment1.part1;

//1. Design Vehicle Hierarchy with following specifications:
//        - The vehicle class has registration no, make, model and price
//- Implement calculateInsurance() method as abstract method in the class
//
//- Create TwoWheeler and FourWheeler as subclasses of Vehicle class
//and implement calculateInsurance () method
//
//For two wheeler the insurance amount is 5% of the price
//For four wheeler the insurance amount is 10% of the price

public abstract class Vehicle {
    String regNo;
    int make;
    String model;
    double price;

    public Vehicle(){
        this("Nil",0000,"None",000);
    }

    public Vehicle(String regNo, int make, String model, double price){
        this.regNo=regNo;
        this.make=make;
        this.model=model;
        this.price=price;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateInsurance();

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo='" + regNo + '\'' +
                ", make=" + make +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", Insurance="+ this.calculateInsurance()+
                '}';
    }
}
