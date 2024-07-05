package com.eergun.w2d5;

public class ex5 {
	/* 1'den 100'e sayıları ekrana yazdır
	3'ün katlarını yanında3KAT
	5'in katlarının yanında 5KAT
	15'in katlarında 15KAT
	*/
	public static void main(String[] args) {
		for (int i = 0; i <= 100 ; i++) {
			if (i % 15 == 0) System.out.println(i + " \t-->\t5KAT");
			else if (i % 5 == 0) System.out.println(i + "\t-->\t5 KAT");
			else if (i % 3 == 0) System.out.println(i + "\t-->\t3 KAT");
			else System.out.println(i);
		}
	}
}