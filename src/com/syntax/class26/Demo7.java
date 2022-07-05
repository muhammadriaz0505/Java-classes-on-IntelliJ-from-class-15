package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add(1,"Jira");

        System.out.println(subjects.indexOf("Java"));
        System.out.println(subjects.size());
        subjects.remove("Git");
        System.out.println("subjects = " + subjects);
        System.out.println(subjects.contains("Selenium"));
        subjects.get(0);
        System.out.println("subjects.get(0) = " + subjects.get(0));
        System.out.println("subjects = " + subjects);
        subjects.clear();
        System.out.println("subjects = " + subjects);

    }
}
