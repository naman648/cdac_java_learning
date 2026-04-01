package com.day2.module;
public class Book {
    private static int count=0;
    private String Title;
    private String Author;
    private double price;
    private int unique;

    public Book(){
        this("Encyclopedia","Rohl dahl",100.0f);
    }
    public Book(String tt, String auth, double pr){
        this.Title=tt;
        this.Author=auth;
        this.price=pr;
        this.unique=++count;

    }

    public int getUnique() {
        return unique;
    }

    public void setUnique(int unique) {
        this.unique = unique;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }
    public String getAuthor(){
        return Author;
    }

    public void setTitle(String Title){
        this.Title=Title;

    }

    public String getTitle(){
        return Title;
    }
    public void setPrice(){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return("UniqueID:"+ this.unique +"Author: "+ this.getAuthor()+"Title: "+this.getTitle()+"Price: "+this.getPrice());

    }

    public double calcdisprice(double dis){
        dis=dis/100;
        return (this.price-dis*this.price);
    }

    public static void main(String [] args){
        Book b1=new Book("Wings of Fire","A.P.J Kalam",150);
        Book b2=new Book("I am malala","Malala",500);
        Book b3 = new Book("TheKiteRunner","Khalid Housanni",600);
        Book b4=new Book();

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());

    }
}

