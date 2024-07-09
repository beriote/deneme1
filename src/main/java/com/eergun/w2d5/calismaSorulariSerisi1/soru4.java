package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz> ");
		int limit = sc.nextInt();
		int step = (limit > 0) ? (2) : (-2);
		System.out.println(limit +" ’ye kadar olan cift sayilar: ");
		for (int i = 0; Math.abs(i) < Math.abs(limit); i+= step){
			System.out.print(i + ", ");
		}
		sc.close();
		
	}
}