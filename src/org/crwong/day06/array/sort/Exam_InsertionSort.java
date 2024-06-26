package org.crwong.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 5와 비교 시작 (i = 1 , j = 0)
		// 첫번째 : 5와 2 비교 -> 교환x ( arrs[1] 과 arrs[0] 비교)
		// 결과 : {2, 5, 4, 1, 3}
		// 두번째 : 4와 비교 시작 (i = 2 , j = 0, 1)
		// 4와 5 비교 -> 교환o (arrs[2]와 arrs[1] 비교)
		// 4와 2 비교 -> 교환x (arrs[2]와 arrs[0] 비교)
		// 결과 : {2, 4, 5, 1, 3}
		// 세번째 : 1과 비교 시작 (i = 3, j = 0, 1, 2)
		// 1과 5 비교 -> 교환o (arrs[3]과 arrs[2] 비교)
		// 1과 4 비교 -> 교환o (arrs[3]과 arrs[1] 비교)
		// 1과 2 비교 -> 교환o (arrs[3]과 arrs[0] 비교)
		// 결과 : {1, 2, 4, 5, 3}
		// 네번째 : 3과 비교 시작 (i = 4, j = 0, 1, 2, 3)
		// 3과 5 비교 -> 교환o (arrs[4]와 arrs[3] 비교)
		// 3과 4 비교 -> 교환o (arrs[4]와 arrs[2] 비교)
		// 3과 2 비교 -> 교환x (arrs[4]와 arrs[1] 비교)
		// 3과 1 비교 -> 교환x (arrs[4]와 arrs[0] 비교)
		// 결과 : {1, 2, 3, 4, 5}

		int arrs[] = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (arrs[j - 1] > arrs[j]) {
					int temp = arrs[j];  // 설명과 다르게
										 // i가 아닌 j인 이유는
										 // 교환이 일어난 후 같은 값으로
										 // 비교하기 위해서임.
					arrs[j] = arrs[j - 1];  
					arrs[j - 1] = temp;    
				}                 
			}
		}
		// 정렬된 결과 출력
		for (int num : arrs) {
			System.out.print(num + " ");
		}
		// 5 하고 2비교,
		// i가 1일때
//		if(arrs[0] > arrs[1]) { 
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp; //arrs[0]이 arrs[1]보다 크면 자리바꿈    
//		}
		// 4하고 5비교, 4하고 2비교,
		// i가 2일때
//		if(arrs[1] < arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[0];
//			arrs[0] = temp;
//		}
		// 1하고 4비교, 1하고 5비교, 1하고 2비교,
		// i가 3일때
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[1] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] < arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[0];
//			arrs[0] = temp;
//		}
		// 3하고 1비교, 3하고 4비교, 3하고 5비교, 1하고 2 비교
		// i 가 4일때
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
//		if(arrs[2] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[1] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[0];
//			arrs[0] = temp;
//		}
	}
}
