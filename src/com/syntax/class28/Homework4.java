package com.syntax.class28;

import java.util.HashMap;
import java.util.Set;

public class Homework4 {
    public static void main(String[] args) {
        HashMap<String,Integer> students=new HashMap<>();
       students.put("Colin",102);
       students.put("Herbert",103);
       students.put("Mujahid",104);
       students.put("Arslan",105);
       students.put("Junaid",106);
        Set<String> key=students.keySet();
        for(String s:key){
            System.out.println(s);
        }
    }
}
