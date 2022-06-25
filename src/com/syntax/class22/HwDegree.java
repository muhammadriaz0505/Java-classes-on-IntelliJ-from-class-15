package com.syntax.class22;

public class HwDegree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends HwDegree{

}
class Masters extends HwDegree{
    public static void main(String[] args) {
        HwDegree hwDegree=new HwDegree();
        hwDegree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}
