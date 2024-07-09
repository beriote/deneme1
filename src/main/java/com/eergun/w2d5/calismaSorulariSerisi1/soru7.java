package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hangi sayinin basamaklari toplansin?> ");
		int sayi = sc.nextInt(), total = 0;
		while (sayi >= 1){
			total += (sayi % 10);
			sayi /= 10;
		}
		System.out.println("Toplam : " + total);
		sc.close();
		
	}
}