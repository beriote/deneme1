package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir cumle yaziniz> ");
		String cumle = sc.nextLine();
		cumle = cumle.trim();
		int min = 0;
		for (int i = 0; i < cumle.length(); i++){
			if (' ' == cumle.charAt(i)) {
				System.out.println(cumle.substring(min, i));
				min = i+1;
			}
		}
		System.out.println(cumle.substring(min));
		sc.close();
		
	}
}