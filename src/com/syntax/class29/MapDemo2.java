package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("Apple",20);
        groceries.put("Water Lemon",20);
        groceries.put("Peach",20);
        groceries.put("Strawberry",20);



        HashMap<String,Integer> cosmatics=new HashMap<>();
        cosmatics.put("foundation",20);
        cosmatics.put("lipstick",25);
        cosmatics.put("mascara",25);
        cosmatics.put("Blush",25);



    }
}
