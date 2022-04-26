/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclienteudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Jupiter
 */
public class ClienteUDP {
    private DatagramSocket udpSocket;
    private InetAddress serverAddress;
    private int port;
    
    public ClienteUDP(String destinationAddr, int port) throws IOException {
        this.serverAddress = InetAddress.getByName(destinationAddr);
        this.port = port + 5;
        udpSocket = new DatagramSocket(this.port);       
    }
    public void Connect() throws IOException {
        String in ="ALOHA";  
        boolean transfering = true;
        while(transfering){        
            DatagramPacket p = new DatagramPacket(in.getBytes(), in.getBytes().length, serverAddress, port - 5);                                            
            this.udpSocket.send(p);                                                     
            transfering = false;
        }        
    }                
    public void Say() throws IOException {        
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);            
            udpSocket.receive(packet);
            String msg = new String(packet.getData()).trim();
            System.out.println("Message from " + packet.getAddress() + ": " + msg);
    } 
}
