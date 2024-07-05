package com.eergun.w2d5;

import java.util.Scanner;

public class ex7 {
	/*
	kullanıcı kenr uzunluğu girsin üçgen ver
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi giriniz> ");
		int length = sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
		sc.close();
		
	}
}