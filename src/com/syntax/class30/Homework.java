package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Homework {
    public static void main(String[] args) throws IOException {


        //Create a property file to store following configurations:
        //browser=chrome
        //https://facebook.com/
        //username
        //password
        //Read file and extract values of browser & url
        String path = "Files/Facebook.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));
        fileInputStream.close();

    }
}
