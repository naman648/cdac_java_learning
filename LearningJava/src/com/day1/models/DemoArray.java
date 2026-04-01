package com.day1.models;

public class DemoArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        //foreach loop
        //for(data type var: collection)
        for(int a: arr){
            System.out.println(a);
        }
        int[] num=new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;

        for(int i=0;i< num.length;i++)
        {
            System.out.println(num[i]*num[i]);
        }
        Date[] dd= new Date[2];
        dd[0]=new Date(12, "March", 2026);
        dd[1]=new Date(13,"March",2026);

        for(Date d:dd)
        {
            System.out.println(d);
        }
    }
}
