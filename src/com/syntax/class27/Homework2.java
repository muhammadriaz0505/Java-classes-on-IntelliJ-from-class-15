package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        List<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("toyota");
        cars.add("Honda");
        cars.add("Lexus");
        cars.add("Tesla");
        System.out.println("cars = " + cars);
        for(String c:cars){
            System.out.print(c+" ");
        }
        System.out.println("");
        String allNames=new String();
        allNames= cars.get(0)+" "+cars.get(1)+" "+cars.get(2)+" "+cars.get(3)+" "+cars.get(4);
        System.out.println(allNames);
for(int i=0; i<cars.size(); i++){
    System.out.print(cars.get(i)+" ");
}

    }
}
