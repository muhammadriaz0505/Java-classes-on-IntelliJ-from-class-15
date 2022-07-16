package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Homework4 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        List<String> drinks=new ArrayList<>();
        drinks.add("Coca cola");
        drinks.add("Pepsi");
        drinks.add("Mountain Dew");
        drinks.add("RedBull");
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.remove(i);
                drinks.add(i,"water");
            }
        }
        System.out.println("drinks = " + drinks);
    }
}
