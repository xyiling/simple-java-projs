package com.xyl.talk2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Client{
    private InetAddress desAddr;
    private int desPort;
    private int srcPort;
    BufferedReader bReader;
    String rawData;
    byte[] data;
    private DatagramSocket socket;
    private DatagramPacket packet;

    public Client(InetAddress addr, int desPort, int srcPort) throws Exception {
        this.srcPort = srcPort;
        this.desAddr = addr;
        this.desPort = desPort;
        this.socket = new DatagramSocket(this.srcPort);     // 这里的DatagramSocket指定的端口是发送端口，对方的目标端口不能是这个
        bReader = new BufferedReader(new InputStreamReader(System.in));
    }
    public void run() {
        try {
            while (true) {
                rawData = bReader.readLine();
                data = rawData.getBytes();
                packet = new DatagramPacket(data, 0, data.length, desAddr, desPort);
                System.out.println("log"+"包数据：["+new String(packet.getData(), 0, packet.getData().length)+"]\n"+"包地址对应的主机名："+packet.getAddress().getHostName()+"\n"+"包发送端口："+packet.getPort()+"\n");
                socket.send(this.packet);                
                if (rawData.equals("bye")) break;
            }
            socket.close();
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
