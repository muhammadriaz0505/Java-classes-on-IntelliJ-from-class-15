package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Homework01 {
    //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
    // Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {

    LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
    building.put(1,"Google");
    building.put(2,"Syntax");
    building.put(3,"Amazon");
    building.put(4,"Google");
    building.put(5,"Facebook");
    building.put(4,"Amazon");
    building.put(7,"Youtube");
        System.out.println(building.size());
        building.replace(4,"Starbucks");
        building.remove(7);

        System.out.println(building);


}
}