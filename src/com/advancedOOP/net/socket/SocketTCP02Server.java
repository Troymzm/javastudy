package com.advancedOOP.net.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mzm
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string = "";
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
//        socket.shutdownInput();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello client");
        bufferedWriter.newLine();
        bufferedWriter.flush(); // 手动刷新
        socket.shutdownOutput();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
