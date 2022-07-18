package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;


public class Homework3 {
    public static void main(String[] args) {
       // Create an arrayList of words. Remove every word that ends with “e”.
       ArrayList<String> words=new ArrayList<>();


        words.add("Hope");
        words.add("Play");
        words.add("vibe");
        words.add("Games");
        System.out.println("words = " + words);
        for(int i=0; i<words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }

        }
        System.out.println("words = " + words);
        }
    }
