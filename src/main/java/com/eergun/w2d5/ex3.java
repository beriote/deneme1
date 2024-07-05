package com.eergun.w2d5;

public class ex3 {
	// 1-100 sadece tekleri topla
	public static void main(String[] args) {
		int tot = 0, min = 0, max = 100, step = 2, remainder = 1;
		boolean isMin = false;
		while (!isMin){
			if (min % step == remainder) isMin = true;
			else min += 1;
		}
		for (int i = min; i <= max; i+= step) {
			tot += i;
		} System.out.println("1'den 100'e tek sayilarin toplami: " + tot);
	}
}