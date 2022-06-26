package com.syntax.class23;

public class Student {
    public void getEducation(){
        System.out.println("Gets education");
    }
    public void decideFuture(){
        System.out.println("Student decide their field for future");
    }
    public void setGoals(){
        System.out.println("Set their future goals");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void getEducation() {
        System.out.println("Gets IT education");
    }
    @Override
    public void decideFuture() {
        System.out.println("Decide SDET course or Cyber security");
    }
    @Override
    public void setGoals() {
        System.out.println("Company to work in future");
    }
}
class CollegeStudent extends Student{
    @Override
    public void getEducation() {
        System.out.println("gets education after high School");
    }
    @Override
    public void decideFuture() {
        System.out.println("Select majors");
    }
    @Override
    public void setGoals() {
        System.out.println("set their future goals");
    }
}
class SchoolStudent extends Student{
    @Override
    public void getEducation() {
        System.out.println("Get their early education");
    }
    @Override
    public void decideFuture() {
        System.out.println("not worry about their future");
    }

    @Override
    public void setGoals() {
        System.out.println("Too young to set their goals");
    }
}
class StudentTester{
    public static void main(String[] args) {
       Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
       for(Student s:students){
           s.getEducation();
           s.decideFuture();
           s.setGoals();
       }



        }

    }


