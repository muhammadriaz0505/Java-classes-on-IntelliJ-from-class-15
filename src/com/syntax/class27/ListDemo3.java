package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> legends = new ArrayList<>();//recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tare");
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Herbert");
        legends.add("Yusuf");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);
        legends.set(0,"Hamid Jan");//replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf"));
        System.out.println(legends.lastIndexOf("Yusuf"));
        System.out.println(legends.subList(0,3));

    }
}
