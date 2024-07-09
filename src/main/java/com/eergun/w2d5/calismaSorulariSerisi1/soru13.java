package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ondalik bir sayi giriniz> ");
		double sayi = sc.nextDouble();
		System.out.println(sayi + "’nin yuvarlanmis hali: " + Math.round(sayi));
		sc.close();

	}
}