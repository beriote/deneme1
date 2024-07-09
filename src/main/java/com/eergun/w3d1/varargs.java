package com.eergun.w3d1;

import java.util.Scanner;

public class varargs {
	public static void main(String[] args) {
		int length = 5;
		int[] arr = new int[length];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < length; i++) {
			System.out.print((i+1) + ". eleman> ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Dizide ne var mı bakacaksın?> ");
		int aranan = sc.nextInt();
		boolean isHere = false;
		
		for (int items: arr){
			if (items == aranan) isHere = true;
		}
		
		if (isHere) System.out.println("Aradigin eleman dizide var. ");
		else System.out.println("Maalesef aradigin elemani dizide bulamadim. ");
		
	}
}