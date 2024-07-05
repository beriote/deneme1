package com.eergun;

import java.util.Scanner;

public class ex1 {
	/*
	mat oyunu, cevap doğruluğu kontrol, doğruysa tebrik et, yanlışsa yanlış de
	 */
	public static void main(String[] args) {
		int soru = 10;
		int cevap = 20;
		
		if (soru == cevap) {
			System.out.println("Tebrikler, doğru bildiniz! ");
		}
		else {
			System.out.println("Maalesef yanlış, yeniden deneyiniz>");
		}
		
		/*
		◾Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor. Ankara'ya gidecek kullanıcılara 100 TL, İstanbul'a gidecek kullanıcılara 200 TL, izmir'egidecek kullanıcılara 150 TL, diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir.
		 */
		
		String sehir = "ıstanbul";
		
		if (sehir.equalsIgnoreCase("Ankara")) System.out.println("100 lira. ");
		else if (sehir.equalsIgnoreCase("İstanbul")) System.out.println("200 lira. ");
		else if (sehir.equalsIgnoreCase("İzmir")) System.out.println("150 lira. ");
		else System.out.println("Maalesef oraya araba kalkmıyor. ");
		
		/*
		kullanıcı not gircek, harf notunu hesapla yazdır
		 */
		
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("Notunuzu giriniz> ");
		grade = sc.nextInt();
		
		if (grade > 100) System.out.println("SS");
		else if (grade >= 90) System.out.println("AA");
		else if (grade >= 80) System.out.println("BA");
		else if (grade >= 70) System.out.println("BB");
		else if (grade >= 60) System.out.println("CB");
		else if (grade >= 50) System.out.println("CC");
		else if (grade >= 40) System.out.println("DC");
		else if (grade >= 30) System.out.println("DD");
		else if (grade >= 0 ) System.out.println("FF");
		else System.out.println("ZZ");
		
		/*
		indirim sezonu!
		1000+ ise %20
		500-999 ise %10
		100-499 ise %5
		100- indirim yok
		 */
		
		sc.nextLine();
		
		System.out.print("Ürün fiyatını giriniz> ");
		float fiyat = sc.nextFloat();
		
		if (fiyat >= 1000) System.out.println("Indirimli fiyat: " + fiyat*0.8);
		else if (fiyat >= 500) System.out.println("Indirimli fiyat: " + fiyat*0.9);
		else if (fiyat >= 100) System.out.println("Indirimli fiyat: " + fiyat*0.95);
		else System.out.println("Indirim yok, fiyat: " + fiyat);
		
		
		
		sc.nextLine();
		
		/*
		Kullanıcının girdiği sayının
		pozitif,
		negatif veya
		sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
		Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.

		 */
		
		int sayi = sc.nextInt();
		
		if (sayi < 0) System.out.println("Sayiniz negatif. ");
		else if (sayi == 0) System.out.println("Sayiniz 0'dır. ");
		else System.out.println("Sayniz pozitiftir. ");
	}
}