package com.eergun.w3d2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class diziler2 {
	
	/*
	her bir satırın ortalamasını bulup ortalama üzerindeki eleman sayısını bulun.
	 */
	public static void main(String[] args) {
		int[][] sayilar = {
				{1, 2, 3, 4},
				{5, 6, 7, 100},
				{0, 10, 11, 12}
		};
		
		double tempAvg;
		for (int i = 0; i < sayilar.length; i++) {
			int count = 0;
			tempAvg = Arrays.stream(sayilar[i]).average().getAsDouble();
			for (int j = 0; j < sayilar[i].length; j++) {
				count += (sayilar[i][j] > tempAvg) ? (1) : (0);
			}
			System.out.println(i + ". satirda avg: " + tempAvg + " ve bunun üstündeki deger sayisi: " + count);
		}
	}
}