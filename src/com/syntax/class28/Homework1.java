package com.syntax.class28;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Homework1 {
    //How can you remove all duplicates from ArrayList?
    //List<String> aList=new ArrayList<>();
    //aList.add("John");
    //aList.add("Jane");
    //aList.add("James");
    //aList.add("Jasmine");
    //aList.add("Jane");
    //aList.add("James");
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
       aList=new ArrayList<>(new LinkedHashSet<>(aList));
        System.out.println(aList);

    }
}
