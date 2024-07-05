package com.eergun.w2d4;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Deger giriniz> ");
		int input = sc.nextInt();
		int factorial = 1;
		
		
		while (input > 1){
			factorial *= input;
			input--;
		}
		
		System.out.println("Faktoriyel: " + factorial);
		
	}
}