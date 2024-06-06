package com.advancedOOP.file.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        // 读取mysql.properties 文件 得到 ip user pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split("=");
            System.out.println(strings[0] + "值是:" + strings[1]);
        }
        bufferedReader.close();
    }
}
