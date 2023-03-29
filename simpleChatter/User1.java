package com.xyl.talk2;

import java.net.InetAddress;

public class User1 {
    public static void main(String[] args) throws Exception {
        // 7778 指的是本地服务器的端口号，客户端靠将数据发送到这个端口号，实现通信
        new Thread(new Server(7778)).start();
        // 7777 指的是 向远程主机到 7777 号端口发送数据
        // 7776 指的是 从本地主机 7776 号端口发出数据
        new Client(InetAddress.getByName("localhost"), 7777, 7776).run();
    }
}