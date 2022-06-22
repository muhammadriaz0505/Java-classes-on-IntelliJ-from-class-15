package com.syntax.class21;

public class ProgrammingTask2 {
    static  void method(){
        System.out.println("I Love Programming languages");
    }
    static void method(String name){
        System.out.println("I love "+name);
    }

    public static void main(String[] args) {
        ProgrammingTask2 p=new ProgrammingTask2();
        p.method();
        p.method("java");
    }
}
