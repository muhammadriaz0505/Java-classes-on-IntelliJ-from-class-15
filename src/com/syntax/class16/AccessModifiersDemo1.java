package com.syntax.class16;

public class AccessModifiersDemo1 {
    private String passWord="pass123";
    int ssn=123546;
    String name="Bilal";

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1 ();
        System.out.println(ac.passWord);
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }

}


