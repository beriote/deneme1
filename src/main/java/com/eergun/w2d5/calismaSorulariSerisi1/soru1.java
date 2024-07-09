package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// a1, a2, a3 kenar uzunluklari
		System.out.print("Ilk kenarin uzunlugu> ");
		int a1 = sc.nextInt();
		System.out.print("Ikinci kenarin uzunlugu> ");
		int a2 = sc.nextInt();
		System.out.print("Ucuncu kenarin uzunlugu> ");
		int a3 = sc.nextInt();
	// a1 = a2 ve a1= a3 ise a1=a2=a3
		if ( (a1 == a2) && (a1 == a3)) System.out.println("Ucgeniniz eskenar ucgen. ");
		else if ((a1 == a2) || (a1 == a3) || (a2 == a3)) System.out.println("Ucgeniniz ikizkenar ucgen. ");
		else System.out.println("Ucgeniniz cesitkenar ucgen. ");
		sc.close();
		
	}
}