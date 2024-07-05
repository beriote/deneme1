package com.eergun.w2d4;

import java.util.Scanner;

public class ex5 {
	/*
	kullanıcıdan alıann kelime palindrom ise palindrom yazdır değilse değil yazdır
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime giriniz> ");
		String kelime = sc.next();
		String tersten = "";
		int i = 0;
		
		while (true){
			try{
				tersten = kelime.charAt(i) + tersten;
				i++;
				System.out.println(tersten);
			}
			catch (Exception e){
				if (tersten.equalsIgnoreCase(kelime)) System.out.println(kelime + " kelimesi palindromdur. ");
				else System.out.println(kelime + " kelimesi palnidrom degildir. ");
				break;
			}
		}
	}
}