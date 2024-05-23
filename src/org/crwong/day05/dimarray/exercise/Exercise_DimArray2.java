package org.crwong.day05.dimarray.exercise;

public class Exercise_DimArray2 {
	public static void main(String[] args) {
		// 내 풀이
//		int [][] arrs = new int[5][5];
//		int k = 1;
//		for (int i = 0; i < 5; i++ ) {
//			for (int j = 0; j < 5; j++) {
//				arrs[i][j] = k;
//				k++;
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arrs[j][i] + " ");
//				System.out.print("\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
		
		// 강사님 풀이
		int arrs [][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arrs[j][i] = k++;
			}
		}
		for(int arr [] : arrs) {
			for (int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
