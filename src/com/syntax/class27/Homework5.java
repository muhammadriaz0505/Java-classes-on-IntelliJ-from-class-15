package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Homework5 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
        List<Integer> evenNumbers=new ArrayList<>();
        for(int i=0; i<500; i++){
            if(i%2==0){
                evenNumbers.add(i);
            }
        }
for(int i=0; i<evenNumbers.size(); i++){
    if(evenNumbers.get(i)%5==0){
        evenNumbers.remove(i);

    }
}
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
