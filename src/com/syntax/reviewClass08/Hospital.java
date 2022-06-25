package com.syntax.reviewClass08;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("jane", "Smith");
        doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();
        System.out.println("----------------");
        //creating another doctor
        Doctor doctor=new Doctor("Joe","Doe","cardiologyst",10);
        doctor.printInfo();
        doctor.work();
        //changig value of static variable
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();
        //changing value of instance variable
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Cllinic";
        System.out.println("                                                          ");
        doc.work();
        doctor.work();
        doctor.treat("Samantha");
        //accessing static method
        Doctor.study("George Town University");

    }
}
