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
                // 创建一个包用于接收数据，存储到 rawData
                packet = new DatagramPacket(rawData, 0, rawData.length);
                // 接收数据
                socket.receive(packet);
                // 从 rawData 读数据到 data
                data = new String(rawData, 0, packet.getLength());
                // 打印数据
                System.out.println(packet.getAddress().getHostName() + "说：");
                System.out.println(data);
                // 断开连接
                if(data.equals("bye")) break;
            }
            // 关闭流
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
