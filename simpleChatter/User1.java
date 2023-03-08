package com.xyl.talk2;

import java.net.InetAddress;

public class User1 {
    public static void main(String[] args) throws Exception {
        new Thread(new Server(7778)).start();
        new Client(InetAddress.getByName("localhost"), 7777, 7776).run();
    }
}