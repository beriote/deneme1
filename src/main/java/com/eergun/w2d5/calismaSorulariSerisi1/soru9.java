package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz> ");
		int sayi = sc.nextInt(), ters = 0, temp;
		temp = sayi;
		while (temp >= 1){
			ters *= 10;
			ters += (temp % 10);
			temp /= 10;
		}
		System.out.println(sayi + "’nin tersi: " + ters);
		sc.close();
		
	}
}