package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Task01 {
    ///*Create a map of a building. Store floor number and its associated company name.(Example: 1= Google, 2=Syntax etc.).
    //Insert 7 entries with duplicate keys and values.
    //- Check how many entries you have?
    //- Update company on a 4th floor
    //- Remove company on the 7th floor
    //- Print your map */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> buildingMap=new LinkedHashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2,"Syntax");
        buildingMap.put(3,"Facebook");
        buildingMap.put(4,"Amazon");
        buildingMap.put(5,"Netflix");
        buildingMap.put(1,"Google");
        buildingMap.put(2,"Oracle");
        System.out.println(buildingMap.size());
        System.out.println(buildingMap);
        buildingMap.replace(5,"Youtube");
        System.out.println(buildingMap);
        buildingMap.remove(5);
        System.out.println(buildingMap);
    }
}
