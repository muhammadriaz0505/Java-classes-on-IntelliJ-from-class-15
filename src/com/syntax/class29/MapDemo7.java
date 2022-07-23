package com.syntax.class29;

import java.util.*;

public class MapDemo7 {
    public static void main(String[] args) {
        //How can we remove the elements from a map bases on the values
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0);//auto upcasting does not work with wrapper
        fruit.put("Orange", 20.5);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Peach", 10.5);
        Collection<Double> values=fruit.values();
        values.removeIf(value-> value>10.2);
        System.out.println(fruit);
        Set<Map.Entry<String,Double>> entries=fruit.entrySet();
        //if key contains the letter e and if its price is greater than 10.2
        entries.removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10.2);
    }
}
