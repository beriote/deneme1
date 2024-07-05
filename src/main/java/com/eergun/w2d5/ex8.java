package com.eergun.w2d5;

import java.util.Scanner;

public class ex8 {
	/*
	ters dik üçgen
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kenar uzunlugu> ");
		int length = sc.nextInt();
		
		for (int i = length; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}