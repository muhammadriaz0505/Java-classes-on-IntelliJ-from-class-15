package com.syntax.class21;

public class Hw3 {
    static void method(){
        System.out.println("I have no method");
    }
    static void method(String name){
        System.out.println("My name is "+name);
    }
    static void method(String name,int age){
        System.out.println("My name is "+name+" My age is "+age);
    }
    static void method(String name,int age,double height){
        System.out.println("My name is "+name+" My age is "+age+" My height is "+height);
    }

    public static void main(String[] args) {
        Hw3 hw=new Hw3();
        hw.method();
        hw.method("Riaz");
        hw.method("Riaz",30);
        hw.method("Riaz",30,5.9);
    }
}
