package com.eergun;

import java.util.Scanner;

public class Man {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir şeyler yaz");
        String girdi = sc.next();
        System.out.println("terminalden alınan değer: " + girdi);
        girdi = sc.next();
        System.out.println("dedin ki: " + girdi);
        int girmedi = sc.nextInt();
        System.out.println("sayi; " + girmedi);


        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("int to byte");
        b = (byte) i;
        System.out.println("i= "+i+"b= "+b);
        System.out.println("double to int");
        i = (int)d;
        System.out.println("d= "+d+"i= "+i);
        System.out.println("double to byte");
        b = (byte)d;
        System.out.println("d= "+d+"a");
        System.out.println("son ekleme");
    }
}