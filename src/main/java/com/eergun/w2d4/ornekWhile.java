package com.eergun.w2d4;

import java.util.Scanner;

public class ornekWhile {
	/*
	kullanıcınını girdiği kelimenin harf sayısını while ile bulan programı yazınız
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Kelime giriniz> ");
		String girdi = sc.next();
		// .charAt() kullanacağız
		
		while(true){
			try {
				girdi.charAt(count);
				count++;
			}
			catch (Exception e) {
				break;
			}
		}
		System.out.println(count);
	}
}