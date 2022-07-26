package com.syntax.review11;

public class FaceBookTester {
    public static void main(String[] args) {
        FaceBookUser faceBookUser=new FaceBookUser("Hamid","Gul","Hamid123","pass123");
        System.out.println(faceBookUser);
        faceBookUser.setUserName("HamidJan");
        System.out.println(faceBookUser);
    }
}
