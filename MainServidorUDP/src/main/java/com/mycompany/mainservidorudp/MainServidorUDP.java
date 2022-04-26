/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainservidorudp;

import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class MainServidorUDP {

    public static void main(String[] args) throws SocketException, Exception {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner (System.in);
        ServidorUDP client = new ServidorUDP(sc.nextInt());
        client.listen();
    }
}
