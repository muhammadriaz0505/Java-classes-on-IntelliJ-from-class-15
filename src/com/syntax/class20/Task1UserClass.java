package com.syntax.class20;

public class Task1UserClass {
   // Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
   // Create a subclass  userInfo that will have user address variable and it also being initialized
    //through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    int mobileNumber;
    Task1UserClass(String name,int mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
  class UserInfo extends Task1UserClass {
      String address;

      UserInfo(String name, int  mobileNumber, String address) {
          super(name, mobileNumber);
          this.address = address;
      }
      String detail(){
          return (name+" "+mobileNumber+" "+address);
      }

      void userDetails() {
          System.out.println("Name " + name + " Mobile Number " + mobileNumber + " address " + address);
      }


  }
    public static void main(String[] args) {


    }
}
