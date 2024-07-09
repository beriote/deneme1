package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Gun numarasi giriniz(1-7)> ");
		int gun = sc.nextInt();
		String vakit = switch (gun){
			case 1, 2, 3, 4, 5 -> {
				System.out.println("Hafta ici");
				yield "Hafta ici";
			} case 6, 7 -> {
				System.out.println("Hafta sonu");
				yield "Hafta sonu";
			}default -> {
				System.out.println("1 ile 7 arasinda bir deger giriniz");
				yield "Gecersiz";
				}
			};
			sc.close();
			
		}
}