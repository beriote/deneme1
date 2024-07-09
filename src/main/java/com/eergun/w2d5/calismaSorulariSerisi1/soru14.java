package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Random;

public class soru14 {
	public static void main(String[] args) {
		Random rand = new Random();
		int sayi = rand.nextInt(1,51);
		System.out.println("Rastgele secilen sayi: " + sayi);
		switch (sayi % 2){
			case 1:
				System.out.println("Rastgele secilen sayi tektir.  ");
				break;
			case 0:
				System.out.println("Rastgele secilen sayi cifttir.  ");
				break;
		}
		
	}
}