package com.syntax.reviewClass08;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Sherlock","Homes","Magic",10);
        //access methods to test visibility
        doc.printInfo();//access to public
        doc.treat("Samantha");
        doc.work();
        Doctor.study("GW");
    }
}
