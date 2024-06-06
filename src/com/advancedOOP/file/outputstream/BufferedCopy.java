package com.advancedOOP.file.outputstream;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";
        String destFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\outputstream\\news_1.txt";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            byte[] buffer = new byte[1024];
            int readLen = 0;

            while ((readLen = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 只需要关闭外部流
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
