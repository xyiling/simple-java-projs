package com.xyl.talk2;

import java.net.InetAddress;

public class User2 {
    public static void main(String[] args) throws Exception {
        new Thread(new Server(7777)).start();
        new Client(InetAddress.getByName("localhost"), 7778, 7779).run();
    }
}
