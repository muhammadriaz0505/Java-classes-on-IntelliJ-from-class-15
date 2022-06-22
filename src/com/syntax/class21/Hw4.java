package com.syntax.class21;

public class Hw4 {
   private void method(){
        System.out.println("I have no method");
    }
    private void method(String name){
        System.out.println("My name is "+name);
    }
   private void method(String name,int age){
        System.out.println("My name is "+name+" My age is "+age);
    }
  private void method(String name,int age,double height){
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
