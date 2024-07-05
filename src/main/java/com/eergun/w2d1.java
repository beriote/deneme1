package com.eergun;

import java.util.Scanner;

public class w2d1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yasiniz kac? ");
		int yas = sc.nextInt();
		
		if (yas < 18){
			System.out.println("Bu icerige erisim izniniz yok. ");
		}
		else if (yas < 30){
			System.out.println("Icerigi goruntulemek icin yasiniz yeterli. ");
		}
		else {
			System.out.println("Bu icerik sizin yas grubunuza yonelik degildir. ");
		}
	}
}