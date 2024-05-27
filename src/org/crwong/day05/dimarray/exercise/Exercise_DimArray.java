package org.crwong.day05.dimarray.exercise;

public class Exercise_DimArray {
	public void practice1() {

		// 내 풀이
//	int [][] arrs = new int[5][5];
//	int k = 1;
//	for (int i = 0; i < 5; i++ ) {
//		for (int j = 0; j < 5; j++) {
//			arrs[i][j] = k;
//			k++;
//		}
//	}
//	for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 5; j++) {
//			System.out.print(arrs[i][4-j] + " ");
//			System.out.print("\t");
//		}
//		System.out.println();
//		System.out.println();
//	}
		// 강사님 풀이
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int[] arr : arrs) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	public void practice2() {
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
	public void practice3() {
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
//				System.out.print(arrs[j][4-i] + " ");
//				System.out.print("\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
		// 강사님 풀이
		int [][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arrs[j][i] = k++;
			}
		}
		for (int [] arr : arrs) {
			for (int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	public void practice4() {
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
//				System.out.print(arrs[i][j] + " ");
//				System.out.print("\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
		// 강사님 풀이
		int [][] arrs =new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
			for (int j = 0; j < 5; j++) {
				arrs[i][j] = k++;
			}
			}else {
				for (int j = 4; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		for (int [] arr : arrs) {
			for (int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	public void practice5() {
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
