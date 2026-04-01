package com.day1.models;

public class Maths {

    public static int add(int a, int b){
        System.out.println("Method 1");
        return a+b;
    }

    public static int add(int a, int b, int c){
        System.out.println("Method 5");
        return a+b+c;
    }

    public  static float add(float a, float b){
        System.out.println("Method 2");
        return a+b;
    }

    public  static float add(int a, float b){
        System.out.println("Method 3");
        return a+b;
    }

    public  static float add(float a, int b){
        System.out.println("Method 4");
        return a+b;
    }

    public static void main(String[] args){

        System.out.println(add(1,2));

        System.out.println(add(1,3.4f));

        System.out.println(add(1.4f,3.8f));

        System.out.println(add(1.2f,2));

        System.out.println(add(1,2,3));
    }

}
