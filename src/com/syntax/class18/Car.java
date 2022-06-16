package com.syntax.class18;

public class Car {
   private String make;
    private String model;
    private String color;
    public Car(){

    }
    public Car(String carModel){
        model=carModel;
    }
    void printCarModel(){
        System.out.println("Model "+model);
    }
    public Car(String carMake,String carModel,String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    void printInfo(){
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }
}
