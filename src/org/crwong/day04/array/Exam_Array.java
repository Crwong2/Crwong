package org.crwong.day04.array;

public class Exam_Array {
	public static void main(String[] args) {
		int num;  // 변수의 선언
		num = 1;  // 변수의 초기화
		
		int [] nums; 	     // 배열의 선언
		nums = new int[10];  // 배열의 생성(할당)
		nums[0] = 1;         // 배열의 초기화
		
		System.out.println(nums[0]);
		System.out.println(nums[1]); 
		System.out.println(nums[2]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		System.out.println(nums.length);    // nums의 길이를 표현
//		System.out.println(nums[10]);   	// 10인 경우에는 오류가 발생한다.
		
		for(int i = 0; i < 10; i++ ) {      // 배열을 for문으로 표현할 수 있다.
			System.out.println(nums[i]);
		}
	}
}
