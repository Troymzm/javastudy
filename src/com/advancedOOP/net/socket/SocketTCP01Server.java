package com.advancedOOP.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mzm
 * @version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        // 在本机的9999端口监听 等待连接 -- 要求在本机没有其他服务在监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        // 当没有客户端连接999+端口时程序会阻塞 等待连接
        // 如果有客户端连接 则会返回 Socket 对象 程序继续
        Socket socket = serverSocket.accept();
        // 通过socket.getInputStream() 得到和socket对象关联的输入流对象
        InputStream inputStream = socket.getInputStream();
        // 通过输入流读取客户端写入到数据通道的数据 IO读取
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readLen));
        }
        // 结束标记
        socket.shutdownInput();

        // 输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client".getBytes());
        // 结束标记
        socket.shutdownOutput();

        // 关闭流和socket
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
