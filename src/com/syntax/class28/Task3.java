package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("game");
        Iterator<String> iterator= words.iterator();
        while(iterator.hasNext()){

            if(iterator.next().endsWith("e"));
            iterator.remove();
            System.out.println(iterator.next());
        }
       words.removeIf(nat -> nat.endsWith("e"));




    }
}