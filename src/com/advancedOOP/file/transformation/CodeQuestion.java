package com.advancedOOP.file.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        // 默认按照utf-8读取
        String fileName = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news4.txt"; // 国标码 GBK
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(fileName));

        String string = bufferedReader.readLine();
        System.out.println(string);

        bufferedReader.close();

    }
}
