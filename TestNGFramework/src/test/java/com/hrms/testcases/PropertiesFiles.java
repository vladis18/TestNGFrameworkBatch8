package com.hrms.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertiesFiles {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\pishi\\IdeaProjects\\TestNGFramework\\src\\test\\java\\com\\hrms\\testcases\\Test.Properties";
        Properties properties = new Properties();
// always load the data before you make changes
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
        System.out.println(properties.getProperty("Username"));
        System.out.println(properties.getProperty("Pass"));
        properties.setProperty("Pass","pas123");
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream,"Changed the password");


    }

}