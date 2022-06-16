package com.syntax.class16;

public class SyntaxEmployee {
int employeeID;
double salary;
 static String ceo="Sumair";
 void employeeInfo(){
     System.out.println("Employee ID is "+employeeID+" Employee salary is "+salary+" and  Syntax CEO is "+ceo);
 }
 public static void main(String[] args) {
        SyntaxEmployee se=new SyntaxEmployee();
        se.employeeID=302;
        se.salary=150000;
        se.employeeInfo();
        SyntaxEmployee se2=new SyntaxEmployee();
        se2.employeeID=420;
        se2.salary=200000;
        se2.employeeInfo();
    }
}
