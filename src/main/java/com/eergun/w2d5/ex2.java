package com.eergun.w2d5;

public class ex2 {
	// 1'den 10'a adar olan sayıların faktoriyellerini yazdır.
	public static void main(String[] args) {
		int i, j, temp=1;
		System.out.println("Sayi\tFaktoriyel\n-----------------");
		for (i = 1; i <= 10; i++){
			for (j=1; j<=i; j++){
				temp *= j;
			}
			System.out.println(i + "!\t=\t" + temp);
			temp = 1;
		}
	}
}