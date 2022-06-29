package com.syntax.class24;

public class Task1 {
    /*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
}
      class Student{
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Student should do homework");
    }
    void practice(){
        System.out.println("Student must practice");
    }
      }

      class SyntaxStudent extends Student{
          @Override
          void study() {
              System.out.println("Syntax students must learn programming");
          }

          @Override
          void doHomeWork() {
              System.out.println("Syntax students must solve Repls to get a geed job");
          }

          @Override
          void practice() {
              System.out.println("Syntax students must practice to get a good job");
          }
      }
        class CollegeStudents extends Student{
            @Override
            void practice() {
                System.out.println("College students must practice");
            }
        }
        class SchoolStudent extends Student{

        }
