package com.syntax.reviewClass7;

public class B13String {
    //Best practice is to always make your instance variable private number
    String str;
    public B13String(String str){
        int number;
        //Error as There is no instance variable number
        this.str=str;

    }
    //write a method that can tell
    public  int countChars(char c){
        int counter=0;
        for(char cha:str.toCharArray()){
            if(cha==c){
                counter++;
            }
        }
        return counter;
    }
    public void printChars(char c){
        int counter=0;
        for(int i=0; i<str.length(); i++){
           if (str.charAt(i)==c){
               counter++;
           }
        }
        System.out.println(c+" has appeared "+counter+" inside this string "+str);
    }
}
