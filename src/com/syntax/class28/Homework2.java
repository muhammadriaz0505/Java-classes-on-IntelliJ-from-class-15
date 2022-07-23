package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Homework2 {
    //Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Pakistan");
        countries.add("United States");
        countries.add("Russia");
        countries.add("China");
        countries.add("Japan");
        countries.add("Korea");
        countries.add("Turkey");
        System.out.println(countries);
        System.out.println("*********************************************");
        for(String country:countries){
            System.out.print(country+" ");

        }
        System.out.println();
        Iterator<String> it=countries.iterator();
        while (it.hasNext()){
            String outPut=it.next();
            System.out.print(outPut+" ");
        }

    }
}
