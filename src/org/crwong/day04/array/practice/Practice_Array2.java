package org.crwong.day04.array.practice;

public class Practice_Array2 {
	public static void main(String[] args) {
		// 실습문제2
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		int [] nums = new int[10];
//		for (int i = 0; i < 10; i++) {
//			nums[i] = (10-i);
//			System.out.print(nums[i] + " ");
//		}
		
		// 강사님 풀이
		int [] nums = new int[10];
//	    int count = 10;
	    for (int i = 0, count = 10; i < 10; i++, count--) {
	    	nums[i] = count;
//	    	count--;
	    }
	    for (int i = 0; i < 10; i++) {
	    	nums[i] = 10-i;
	    }
	    for(int i = 0; i < 10; i++) {
	    System.out.print(nums[i]+ " ");
	    }
	}
}
