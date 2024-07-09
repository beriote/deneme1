package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru6 {
	public static void main(String[] args) {
		int temp, total = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Bir sayi giriniz(negatif exit)> ");
			temp = sc.nextInt();
			if (temp > 0) total += temp;
		} while (temp >= 0);
		System.out.println("Girdiginiz sayilarin toplami: " + total);
		sc.close();
		
	}
}