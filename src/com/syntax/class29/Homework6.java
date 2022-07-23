package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Homework6 {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        LinkedHashSet<String> words=new LinkedHashSet<>();
        words.add("I");
        words.add("Enjoy");
        words.add("My");
        words.add("Java");
        words.add("Class.");
        Iterator<String> it= words.iterator();
        while (it.hasNext()){
            String concat=it.next();
            System.out.print(concat+" ");
        }
    }
}
