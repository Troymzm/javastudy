package com.advancedOOP.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author mzm
 * @version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 连接InetAddress.getLocalHost()的9999端口
        // 连接上后 生成Socket 通过socket.getOutputStream() 得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        // 通过输出流 写入数据到 数据信道
        outputStream.write("hello server".getBytes());
        // 结束标记
        socket.shutdownOutput();
        // 通过输入流 从数据信道中 获取数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readLen));
        }
        // 结束标记
        socket.shutdownInput();
        // 关闭流对象和socket
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
