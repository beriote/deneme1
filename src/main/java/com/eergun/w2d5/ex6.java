package com.eergun.w2d5;

import java.util.Scanner;

public class ex6 {
	/*
	kullanıcıdan alınan sayı kadar satır ve sütuna sahip bir kare çizen programı yazın.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String edge = "";
		System.out.print("Karenin kenarı ne kadar uzun olsun?> ");
		int length = sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			edge += "*";
			
		}
		for (int i = 0; i < length; i++) {
			System.out.println(edge);
		}
		sc.close();
	}
}