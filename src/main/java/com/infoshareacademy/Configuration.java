package com.infoshareacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Configuration {
    private Path path = Paths.get("src", "main","resources", "kulturalni.properties");
    private File file = new File(String.valueOf(path));
    private Properties properties = new Properties();


    private void loadProperties() {
        FileInputStream in;
        try {
            in = new FileInputStream(file);
            properties.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No such file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO error");
        }
    }










}
