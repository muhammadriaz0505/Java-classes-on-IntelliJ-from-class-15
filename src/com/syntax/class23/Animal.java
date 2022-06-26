package com.syntax.class23;

public class Animal {
    Animal(){
        System.out.println("Parent");
    }
    void eat(){
        System.out.println("All the animal eat");
    }
}
class Panda extends Animal{
    //no other class inharit from

}
