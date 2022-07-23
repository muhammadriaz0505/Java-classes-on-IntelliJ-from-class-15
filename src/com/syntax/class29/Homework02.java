package com.syntax.class29;

import java.util.*;

public class Homework02 {
//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
public static void main(String[] args) {

    TreeMap<String, String> countriesAndCapitals = new TreeMap<>();
    countriesAndCapitals.put("USA","WashingtonDC");
    countriesAndCapitals.put("Pakistan","Islamabad");
    countriesAndCapitals.put("Russia","Moscow");
    countriesAndCapitals.put("China","Beijing");
    countriesAndCapitals.put("England","London");
    countriesAndCapitals.put("Canada","Toronto");
    System.out.println(countriesAndCapitals);
    System.out.println("**********Using while Loop************************");
    Set<Map.Entry<String,String>> entries=countriesAndCapitals.entrySet();
    Iterator<Map.Entry<String,String>> it=entries.iterator();
    while (it.hasNext()){
        System.out.print(it.next()+" ");
    }
    System.out.println();

   for(Map.Entry<String,String> entry:entries){
       System.out.print(entry);
   }
    System.out.println();
   Collection<String> values=countriesAndCapitals.values();
   Iterator<String> it1= values.iterator();
   while (it1.hasNext()){
       System.out.print(it1.next()+" ");

   }
    System.out.println();
    Collection<String> values1=countriesAndCapitals.values();
   for(String value:values1){
       System.out.print(value+" ");
   }

}
}
