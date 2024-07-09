package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru11 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		String metin = sc.nextLine();
		for (int i = 0; i < metin.length(); i++) {
			switch (metin.charAt(i)) {
				case 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü':
					count += 1;
				default:
					continue;
			}
			
		}
		System.out.println("Girdiginiz metindeki sesli harf sayisi: " + count);
		sc.close();
	}
}