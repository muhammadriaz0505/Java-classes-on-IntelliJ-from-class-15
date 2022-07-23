package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruit=new TreeMap<>();
       fruit.put("Apple",20);
       fruit.put("Water Lemon",20);
       fruit.put("Peach",20);
       fruit.put("Strawberry",20);



        HashMap<String,Integer> cosmetics=new HashMap<>();
       cosmetics.put("foundation",20);
       cosmetics.put("lipstick",25);
       cosmetics.put("mascara",25);
       cosmetics.put("Blush",25);


        LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(cosmetics);
        System.out.println(groceries);



    }
}
