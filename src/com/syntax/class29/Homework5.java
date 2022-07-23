package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework5 {
    //Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {
        HashMap<String,Integer> entries=new HashMap<>();
        entries.put("John",90000);
        entries.put("James",55000);
        entries.put("Jimmy",105000);
        entries.put("Jacob",75000);
        Set<Map.Entry<String,Integer>> salaries=entries.entrySet();
        Iterator<Map.Entry<String,Integer>> it=salaries.iterator();
        int maxSalary=0;
        String employe="";

            while (it.hasNext()){
                Map.Entry<String,Integer> sal= it.next();
                if(sal.getValue()>maxSalary){
                    maxSalary=sal.getValue();
                    employe=sal.getKey();
                }
            }
            System.out.println(employe+" $"+maxSalary);
        }

    }

