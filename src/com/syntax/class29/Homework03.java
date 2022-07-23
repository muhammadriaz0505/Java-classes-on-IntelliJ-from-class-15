package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(9999912,"TV");
        bestBuy.put(9999923,"Printer");
        bestBuy.put(9999933,"Laptops");
        bestBuy.put(9999943,"Cameras");
        bestBuy.put(9999953,"Video Games");
        bestBuy.put(9999963,"Toys");
        bestBuy.put(9999973,"HardWare");
        Set<Map.Entry<Integer,String >> entries=bestBuy.entrySet();
        System.out.println(entries);
        System.out.println();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.print(entry+" ");
        }
        System.out.println();
        System.out.println("********With WhileLoop****************8");
        Iterator<Map.Entry<Integer,String>> it=entries.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
