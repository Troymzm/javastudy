package com.advancedOOP.file.outputstream;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        // 序列化后保存的格式不是纯文本的格式
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\outputstream\\data.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据到文件中
        objectOutputStream.writeInt(100); // int -> Integer 实现了 Serializable
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.5);
        objectOutputStream.writeUTF("你好");
        // 保存一个dog对象
        objectOutputStream.writeObject(new Dog("冯福利", 10, "黄色", "China"));
        objectOutputStream.close();
    }
}
