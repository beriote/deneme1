package com.eergun.w2d3;

import java.util.Scanner;

public class ex2 {
	/*
	öğrenciden not al
	not 50'den küçükse kaldı
	büyükse geçer
	TERNARY YAZ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float grade = sc.nextFloat();
		String sonuc = (grade < 50)? "Kaldın ": "Gectin ";
		System.out.println(sonuc);
	}
}