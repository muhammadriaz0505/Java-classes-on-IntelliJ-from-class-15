package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework7 {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(200);
        numbers.add(500);
        numbers.add(1000);
       int sum=0;
       for(Integer num:numbers){
           sum+=num;
       }
        System.out.println(sum);
    }
}