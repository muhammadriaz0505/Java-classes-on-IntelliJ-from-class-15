package com.syntax.class28;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> letters=new TreeSet<>();
        letters.add("z");
        letters.add("b");
        letters.add("a");
        letters.add("c");
        letters.add("d");
        System.out.println(letters);


        TreeSet<String> letters2=new TreeSet<>();
        letters2.add("az");
        letters2.add("ab");
        letters2.add("ca");
        letters2.add("dc");
        letters2.add("ak");
        letters2.add("aa");
        System.out.println(letters2);

    }
}
