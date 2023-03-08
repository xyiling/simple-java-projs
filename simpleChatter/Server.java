package com.xyl.talk2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class Server implements Runnable {
    private DatagramSocket socket;
    private DatagramPacket packet;

    private byte[] rawData;
    private String data;
    private int port;
    public Server(int port) throws Exception {
        this.port = port;
        this.socket = new DatagramSocket(this.port);        
        this.rawData = new byte[1024];
    }
    @Override
    public void run() {
        try {
            while (true) {
                packet = new DatagramPacket(rawData, 0, rawData.length);
                socket.receive(packet);
                data = new String(rawData, 0, packet.getLength());
                System.out.println("接收到来自"+packet.getAddress().getHostName() + "的数据");
                System.out.println(">> "+data);
                if(data.equals("bye")) break;
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
