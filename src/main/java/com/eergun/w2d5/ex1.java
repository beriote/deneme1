package com.eergun.w2d5;

import java.util.Scanner;

public class ex1 {
	// 1-n'ye kadar olan sayıların toplamını for le yap
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0, i, total = 0;
		boolean isNumber = false;
		while (!isNumber){
			System.out.print("Bir syai girinz> ");
			isNumber = sc.hasNextInt();
			if (isNumber) number = sc.nextInt();
			else {
				System.out.println("Deger gecersiz");
			}
		}
		
		for (i = 1; i <= number; i++){
			total += i;
		}
		System.out.println("1'den " + number + "'e kadr olan sayıların toplamı: " + total);
	}
}