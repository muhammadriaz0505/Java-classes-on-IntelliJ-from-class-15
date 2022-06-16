package com.syntax.class15;

public class Task05 {
    //Create a method createEmail(). Based on values of users name,
    // lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail)
    String completeEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Task05 task=new Task05();
        System.out.println(task.completeEmail("Tara","Sitara","gmail"));

    }
}
