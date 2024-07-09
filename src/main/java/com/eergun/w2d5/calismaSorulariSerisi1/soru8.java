package com.eergun.w2d5.calismaSorulariSerisi1;

import java.util.Scanner;

public class soru8 {
	public static void main(String[] args) {
		int sayi = 0, factorial;
		Scanner sc = new Scanner(System.in);
		while (!(sayi < 0)){
			System.out.print("Sayi giriniz> ");
			sayi = sc.nextInt();
			if (sayi >= 0){
				factorial = 1;
				for (int i = 2; i <= sayi; i++){
					factorial *= i;
				}
				System.out.println(sayi + "’nin faktoriyeli: " + factorial);
			}
		}
		sc.close();
		
	}
}