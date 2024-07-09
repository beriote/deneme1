package com.eergun.w3d2;

import java.util.Arrays;
import java.util.List;

public class soru20 {
	public static void main(String[] args) {
		
		Integer[] sayilar = {6, 8, 2, 5, 3};
		int[] sayilar1 = {6, 8, 2, 5, 3};
		String[] isimler = {"Ahmet", "Su", "Can", "Pelin", "Atakan"};
		
		System.out.println(Arrays.toString(sayilar));
		System.out.println(Arrays.toString(isimler));
		
		Arrays.sort(sayilar);
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(sayilar));
		System.out.println(Arrays.toString(isimler));
		
		System.out.println("iste liste:");
		List<Integer> liste = Arrays.asList(sayilar);
		List<int[]> liste1 = Arrays.asList(sayilar1);
		System.out.println(liste);
		System.out.println("kötü hali:");
		System.out.println(liste1);
	}
}