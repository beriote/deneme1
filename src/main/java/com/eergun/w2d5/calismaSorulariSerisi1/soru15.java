package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Random;

public class soru15 {
	public static void main(String[] args) {
		Random rand = new Random();
		double rannum = rand.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE) + rand.nextDouble();
		System.out.println("Rastgele secilen sayi: " + rannum);
		if (rannum <= 10 && rannum >= 1) System.out.println("Rastgele secilen sayi 1-10 araligindadir.");
		else System.out.println("Rastgele seçilen sayi 1-10 araliginda degildir. ");
		
	}
}