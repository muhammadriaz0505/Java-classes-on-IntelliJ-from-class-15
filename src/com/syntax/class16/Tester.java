package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1 ();
        //System.out.println(ac.passWord);//cannot get error because its privare
        String str =new String();//we don't see any import because this class is present inside the java.lang
        //all teh classes inside java.lang pakage are imported by default for
        System.out.println(ac.ssn);
        System.out.println(ac.name);
        Employee emp=new Employee();
        Scanner scanner=new Scanner(System.in);
    }
}
