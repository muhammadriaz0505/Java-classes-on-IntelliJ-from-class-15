package com.syntax.class29;

import java.util.*;

public class Homework04 {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
}
 class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;
    Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    public void detail(){
         System.out.println("Name ="+name+" "+lastName+", "+"Age ="+age+", "+"Salary ="+salary);
     }
     public static void main(String[] args) {
         Person person1=new Person("Javed","Mansha",45,50000);
         Person person2=new Person("Will","Smith",50,5000000);
         Person person3=new Person("Danial","Pearl",25,400000);
         Person person4=new Person("James","Bond",56,10000000);
         Person person5=new Person("Hassan","Sardar",35,70000);
         LinkedHashMap<Integer,Person> people=new LinkedHashMap<>();
         people.put(00001,person1);
         people.put(00002,person2);
         people.put(00003,person3);
         people.put(00004,person4);
         people.put(00005,person5);
         Set<Map.Entry<Integer,Person>> entries=people.entrySet();
         Iterator<Map.Entry<Integer,Person>> it= entries.iterator();
         while(it.hasNext()){
             Map.Entry<Integer,Person> p=it.next();
             System.out.println("ID = "+p.getKey()+" ");

            p.getValue().detail();
         }

    }


}
