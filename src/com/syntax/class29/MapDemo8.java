package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo8 {
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
        Iterator<Map.Entry<String,Double>> iterator=fruit.entrySet().iterator();
        while(iterator.hasNext()){
           Map.Entry<String,Double> en=iterator.next();
            if(en.getKey().contains("e")&&en.getValue()>15){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
