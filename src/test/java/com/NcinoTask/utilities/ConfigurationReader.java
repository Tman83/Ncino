package com.NcinoTask.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the object of Properties
    private static Properties properties = new Properties();

    static {

        try {

            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader Class");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
