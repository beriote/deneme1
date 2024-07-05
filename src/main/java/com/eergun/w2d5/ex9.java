package com.eergun.w2d5;

import java.util.Scanner;

public class ex9 {
	/*
	tesr ucgen
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi giriniz> ");
		int length = sc.nextInt();
		for (int i = 1; i <= length; i++) {
			for (int j = i; j < length; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}