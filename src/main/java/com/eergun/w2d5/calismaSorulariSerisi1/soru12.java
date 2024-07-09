package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban degerini giriniz> ");
		double base = sc.nextDouble();
		System.out.print("Us degerini giriniz> ");
		double exp = sc.nextDouble();
		System.out.println(base + " uzeri " + exp + " " + Math.pow(base, exp) + "’e esittir. ");
		sc.close();
		
	}
}