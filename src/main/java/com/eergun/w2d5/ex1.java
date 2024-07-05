package com.eergun.w2d5;

import java.util.Scanner;

public class ex1 {
	// 1-n'ye kadar olan sayıların toplamını for le yap
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0, i, total = 0;
		boolean isNumber = false;
		do {
			try {
				System.out.print("Sayig iriniz> ");
				number = sc.nextInt();
				isNumber = true;
			}
			catch (Exception e) {
				System.out.println("Lutfen sayi disinda bir sey girmeyiniz. ");
			}
		} while (!isNumber);
		
		for (i = 1; i <= number; i++){
			total += i;
		}
		System.out.println("1'den " + number + "'e kadr olan sayıların toplamı: " + total);
		
	}
}