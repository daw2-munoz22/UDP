/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainclienteudp;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class MainClienteUDP {

    public static void main(String[] args) throws IOException{
        //System.out.println("Hello World!");        
        Scanner sc = new Scanner (System.in);        
        
        String IP = sc.next();               
        int port = sc.nextInt();    
        
        sc.close();   
        
        ClienteUDP send = new ClienteUDP(IP, port);       
        send.Connect();       
        send.Say();
    }
}
