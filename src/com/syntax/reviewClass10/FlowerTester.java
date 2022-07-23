package com.syntax.reviewClass10;

public class FlowerTester {
    public static void main(String[] args) {
        Rose rose=new Rose("Red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        System.out.println("****************************");
        Flower flower=new Rose("Green");
       flower.showColor();
       flower.bloom();
       flower.smell();
        //flower.thorns(); not possible
        Rose rose1=(Rose) flower;
        rose1.thorns();
        Flower[] flowers={new Rose("Red"),new Tulips("Pink")};
        System.out.println("*******************");
        for(Flower flower1:flowers){
            flower1.bloom();
            flower1.smell();
        }
        main("katerina got confused");
    }

    public static void main(String args) {
        System.out.println("Hehhhe got confused");
    }
}
