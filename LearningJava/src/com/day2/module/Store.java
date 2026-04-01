package com.day2.module;

import java.util.Scanner;

public class Store {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Book b1=new Book("Wings of Fire","A.P.J Kalam",150);
        Book b2=new Book("I am malala","Malala",500);
        Book b3 = new Book("TheKiteRunner","Khalid Housanni",600);
        Book b4=new Book();

        String title="";
        String auth ="";
        double price=0.0f;
        double dis=0;

        Book b[]=new Book[4];
    int i=0;
        while(i<4) {
            System.out.println("Enter your choice: \n 1. Enter book details 2. Exit ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter book Title: ");
                title=sc.next();
                System.out.println("Enter book Author: ");
                auth=sc.next();
                System.out.println("Enter book Price: ");
                price=sc.nextDouble();
                System.out.println("Enter book discount:");
                dis=sc.nextDouble();

                Book f = new Book(title,auth,price);
                    b[i]=f;
                    i++;
//                for(Book l:b){
//                    l.toString();
//                }
            }
            else {
                System.out.println("Exiting ....");
                break;
            }
        }

        b[0]=b1;
        b[1]=b2;
        b[2]=b3;
        b[3]=b4;


        for(Book f: b){
            System.out.println(f.getTitle());
            System.out.print("Enter discount %: ");
            dis=sc.nextDouble();
            System.out.print(f.toString());
            System.out.println("Discounted Price: "+f.calcdisprice(dis));
        }
        sc.close();
    }
}
