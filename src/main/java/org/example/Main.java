package org.example;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E://workplace//IdeaProject//start//pom.xml");
        FileOutputStream fileOutputStream = new FileOutputStream("E://workplace//pom.xml");


        int b ;
        while ((b=fileInputStream.read()) != -1){
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}