package com.syntax.class21;

public class AreaTask1 {


    static void area(double height, double width){
        double rectangle=height*width;
        System.out.println("Area of Rectangle is "+rectangle);
    }
    static void area(double length){
        double square=Math.pow(length,2);

        System.out.println("Area of Square is "+square);
    }
    static void area(double length,double height,double width){

     double box=2*(height*width+height*length+width*length);
        System.out.println("Area of box is "+box);
    }

    public static void main(String[] args) {

    }
}
 class AreaTask1Tester{
     public static void main(String[] args) {
         AreaTask1 a=new AreaTask1();
                 a.area(4);
                 a.area(4,5,6);
                 a.area(4,6);
     }
}