package org.crwong.day05.dimarray.exercise;

public class Exercise_DimArray5 {
	public static void main(String[] args) {
		int [][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
			for (int j = 0; j < 5; j++) {
				arrs[i][4-j] = k;
				k++;
			}
			}else {
//				for
			}
		}
//		for (int )
	}
}
