package com.syntax.class28;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class Homework3 {
    //Create a Set of cities in which you want to make sure that insertion order is maintained.
    // Then remove any city that starts with “A”;
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Woodbridge");
        cities.add("Falls Church");
        cities.add("Arlington");
        cities.add("Spring field");
        cities.add("Ashburn");
        Iterator<String> iterator = cities.iterator();
        //cities.removeIf(nat -> nat.startsWith("A"));

        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }

        }
        System.out.println(cities);
    }
}