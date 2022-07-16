package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
   // Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
   public static void main(String[] args) {


       List<String> names = new ArrayList<>();
       names.add("Colin");
       names.add("Herbert");
       names.add("Karla");
       names.add("Rizwana");
       names.add("Hidayat");
       System.out.println(names.isEmpty());
       System.out.println(names.contains("Rizwana"));
       System.out.println(names.size());
       System.out.println("names = " + names);
   }
}
