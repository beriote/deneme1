package com.eergun.w2d5;

public class ex4 {
	// 1'den 50'ye olanlardan 3'ün katı
	public static void main(String[] args) {
		int tot = 0, min = 1, max = 50, step = 3, remainder = 0;
		boolean isMin = false;
		while (!isMin){
			if (min % step == remainder) isMin = true;
			else min += 1;
		}
		for (int i = min; i <= max; i+= step) {
			tot += i;
			System.out.println(i);
		} System.out.println("1'den 100'e tek sayilarin toplami: " + tot);
	}
}