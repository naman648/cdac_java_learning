package com.assignment1.part1;

public class TwoWheeler extends Vehicle{

    public TwoWheeler(String regNo, int make, String model, double price){
        super(regNo,make,model,price);
    }
    @Override
    public double calculateInsurance() {
        return this.price*0.05;
    }
}
