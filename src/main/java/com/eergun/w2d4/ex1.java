package com.eergun.w2d4;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		BigDecimal sayi = new BigDecimal("0.1");
		BigDecimal sonucBigDecimal = sayi.add(sayi).add(sayi).add(sayi).add(sayi).add(sayi).add(sayi);
		System.out.println(sonucBigDecimal);
// OUtput --> 0.7 (hatasız)
		
		BigDecimal sonucBigDecimal2 = sayi.multiply(sayi);
		System.out.println(sonucBigDecimal2);
		//add veya multiply diyince hafızada tutmuyor
		sonucBigDecimal2.add(sayi);
		System.out.println(sonucBigDecimal2);
//Output --> 0.01 (hatasız)
//
		
		/*
		kullanıcıdan alınan sayıların toplamını hesapla (kullanıcı 0 girene kadar program çalışsın)
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		int num= -1, total = 0;
		while (num != 0) {
			System.out.println("Bir sayi gir(0. Exit)");
			num = sc.nextInt(); sc.nextLine();
			total += num;
			System.out.println("Toplam: " + total);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		int num;
		int tot = 0;
		while ((num = sc.nextInt()) != 0) {
			tot += num;
			System.out.println("Bir syai girniz");
		}
		
	}
}