package com.advancedOOP.file.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author mzm
 * @version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("你好");
        printWriter.close();

        printWriter = new PrintWriter(new FileWriter("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news5.txt"));
        printWriter.print("你好");
        printWriter.close();
    }
}
