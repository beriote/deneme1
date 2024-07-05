package com.eergun.w2d3;

import java.util.Scanner;

public class switchKullan {
	/*
	switch case ile harf notu bulma
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		String grade = switch (not/10){
			case 10, 9 -> "AA";
			case 8 -> "BA";
			case 7 -> "BB";
			case 6 -> "CB";
			case 5 -> "CC";
			case 4 -> "DC";
			case 3 -> "DD";
			default -> "Yanlis not degeri girilmis...";
		};
		System.out.println("Harf notunuz: " + grade);
	}
}