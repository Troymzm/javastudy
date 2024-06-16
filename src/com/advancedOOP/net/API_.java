package com.advancedOOP.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author mzm
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 根据指定主机名 获取InetAddress对象
        InetAddress mzm = InetAddress.getByName("MZM");
        System.out.println(mzm);

        // 根据指定域名 获取InetAddress对象
        InetAddress host = InetAddress.getByName("www.baidu.com");
        System.out.println(host);

        // 根据InetAddress 获取对应地址
        String hostAddress = host.getHostAddress();
        System.out.println(hostAddress);

        // 通过InetAddress 获取主机名或者域名
        String hostName = host.getHostName();
        System.out.println(hostName);
    }
}
