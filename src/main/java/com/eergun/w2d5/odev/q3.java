package com.eergun.w2d5.odev;

import java.util.Scanner;

public class q3 {
	/*
	asaginaki şekli vren programı for ile yzz
	
	*
	*
	**
	*
	**
	***
	*
	**
	***
	****
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Oruntu kaca kadar devam etsin?> ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k <= j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}