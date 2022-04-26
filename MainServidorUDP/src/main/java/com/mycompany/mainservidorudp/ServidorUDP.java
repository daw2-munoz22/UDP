/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainservidorudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Jupiter
 */
public class ServidorUDP {
    private int port;
    private DatagramSocket socket;
    public ServidorUDP(int port) throws SocketException{
        this.port = port;
        this.socket = new DatagramSocket(port);
    }
    public void listen() throws Exception {
        System.out.println("-- Running Server at " + InetAddress.getLocalHost() + ":" + port);
        String msg;

        while (true) {
            byte[] bf = new byte[256];
            DatagramPacket packet = new DatagramPacket(bf, bf.length);

            // blocks until a packet is received
            socket.receive(packet);
            msg = new String(packet.getData()).trim();

            System.out.println(packet.getAddress().getHostAddress() + msg);



            String in ="ALOHA";
            DatagramPacket p = new DatagramPacket(in.getBytes(), in.getBytes().length, packet.getAddress(), packet.getPort());
            this.socket.send(p);
       }
    }
}
