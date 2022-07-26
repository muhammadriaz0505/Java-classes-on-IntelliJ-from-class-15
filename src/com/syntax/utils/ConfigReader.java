package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path) throws IOException {
        //Navigate to that location
        FileInputStream fileInputStream=new FileInputStream(path);
        //Properties class that handles the .properties files
        Properties properties=new Properties();
        //Loads the data from The HardDrive to Ram
        properties.load(fileInputStream);
        return properties;
    }

    }

