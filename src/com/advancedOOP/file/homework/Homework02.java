package com.advancedOOP.file.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String string = "";
        int count = 0;
        while((string = bufferedReader.readLine()) != null) {
            System.out.println((++count) + "\t" + string);
        }
        bufferedReader.close();
    }
}
