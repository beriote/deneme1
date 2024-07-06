package com.eergun.w2d5.odev;

import java.util.Scanner;

public class q2 {
	/*
	ters eşknera
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ters ucgen kac kenar olsun?> ");
		int star = sc.nextInt();
		
		for (int i = star; i >= 0 ; i--) {
			for (int j = star; j > i ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}