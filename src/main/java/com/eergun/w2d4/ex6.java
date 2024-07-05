package com.eergun.w2d4;

public class ex6 {
	/*
	1'den 100'e sayıların toplamını while ile hesaplama
	 */
	public static void main(String[] args) {
		int i = 0, tot = 0;
		while (i < 101){
			tot += i;
			i++;
		}
		System.out.println("1'den 100'e olan sayilarin toplami: " + tot);
	}
}