package com.syntax.class27;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> legends = new ArrayList<>();
        //we can sote the object of a clss inside a variable type parent class
        //interface if that class implements that interface
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tare");
        legends.add("Yusuf");
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("Hamid"));
        Object [] arr= legends.toArray();
        System.out.println(arr[0]);
        System.out.println(legends);
        legends.remove("Hamid");
        System.out.println(legends);
        List<String> someStudents=new ArrayList<>();
someStudents.add("Naveed");
someStudents.add("Karla");
        System.out.println(legends.containsAll(someStudents));
    }
}