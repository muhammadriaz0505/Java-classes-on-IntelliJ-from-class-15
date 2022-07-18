package com.syntax.class28;

import java.util.ArrayList;

public class Task4 {
    ////Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("patti chai");
        drinks.add("Vodka");
        drinks.add("whiskey");
        drinks.add("Coffe");
        drinks.add("Ayran");
        drinks.add("Milk");
        drinks.add("Margarita");
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");//replaced
            }
        }
        System.out.println(drinks);
    }
}
