package com.advancedOOP.file.inputstream;

import com.advancedOOP.file.outputstream.Dog;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 指定反序列化的文件
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\outputstream\\data.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        // 反序列化的顺序需要和保存的顺序一致 否则出异常
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        Object object = objectInputStream.readObject();
        System.out.println(object.getClass());
        System.out.println(object);

        // 调用方法需要向下转型
        Dog dog = (Dog) object;
        System.out.println(dog.getAge());
        System.out.println(dog.getName());

        // 关闭外层流
        objectInputStream.close();
    }
}