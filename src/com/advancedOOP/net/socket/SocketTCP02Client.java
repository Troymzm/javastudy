package com.advancedOOP.net.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author mzm
 * @version 1.0
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello server");
        bufferedWriter.newLine(); // 结束符
        bufferedWriter.flush(); // 手动刷新
        socket.shutdownOutput();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string = "";
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
//        socket.shutdownInput();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
