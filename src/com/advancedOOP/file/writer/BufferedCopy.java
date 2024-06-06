package com.advancedOOP.file.writer;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";
        String destFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\writer\\news_1.txt";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
            String line;

            // 读取
            while ((line = bufferedReader.readLine()) != null) {
                // 每读取一行就写入
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // 需要手动添加换行符
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
