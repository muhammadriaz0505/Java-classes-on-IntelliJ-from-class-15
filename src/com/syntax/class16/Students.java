package com.syntax.class16;

public class Students {
String name;
int id;
static int numberOfStudents;
void numberOfStudents() {
    System.out.println("The total number of students are "+numberOfStudents);
}
public static void main(String[] args) {
        Students st=new Students();
        st.name="Harris";
        st.id=507;
        st.numberOfStudents=1;
        Students st2=new Students();
        st2.name="Hassam";
        st2.id=824;
        st2.numberOfStudents=2;
        Students st3=new Students();
        st3.name="Hamza";
        st3.id=709;
        st3.numberOfStudents=3;
        st3.numberOfStudents();

    }
}
