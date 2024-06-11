package org.crwong.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
//		다음 아래의 요구사항에 맞도록 Java 프로그램을 제작하시오
//
//		1. 구현 클래스  
//		Package명        클래스명     메소드                                  설명
//		kr.or.iei           Question1   +main(args:String []):void         main 함수 안에서 모든 코드 작업 진행
//
//		2. 구현 내용
//		 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오 
//		 - 요구사항
//		     1) 패키지명, 클래스명, 메소드명을 모두 요구사항에 맞게 제작
//		     2) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함 (정수 5개 입력받는 배열 사용)
//		     3) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함
//		     4) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함
//		     5) 마지막에 첫번째 수와 마지막수를 합한 값을 출력할 수 있어야 함
		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			int num = sc.nextInt();
			arrs[i] = num;
		}
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for (int num : arrs) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("정렬 후 첫번째 수와 마지막 수의 합 : "+(arrs[0] + arrs[4]));
		// 강사님 풀이
		// 1. 크기 5인 정수 배열 생성
//		Scanner sc = new Scanner(System.in);
//		int length = 5;
//		int [] nums = new int[5];
//		// 2. 배열에 값 입력하기 5번
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print((i+1) + "번째 입력 : ");
//			int num = sc.nextInt();
//			nums[i] = num;
//		}
//		// 3. 정렬하기 - 버블정렬 알고리즘
//		// 1 - 2, 2 - 3, 3 - 4, 4 - 5
//		//최대값을 맨 오른쪽에 위치하면서 정렬하는 알고리즘
//		// 1 - 2, 2 - 3, 3 - 4
//		// 1 - 2, 2 - 3
//		// 1 - 2
//		for (int i = 0; i < nums.length-1; i++) {
//			for (int j = 0; j < (nums.length-1)-i; j++) {
//				if(nums[j] > nums[j+1]) {
//					int temp = nums[j+1];
//					nums[j+1] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
//		// 4. 출력하기
//		System.out.print("정렬된 결과 : ");
//		for (int num : nums) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//		// 5. 처음과 끝 합해서 출력하기
//		System.out.print("정렬 후 첫번째 수와 마지막 수의 합 : ");
		// 문자열 + 정수 = 문자열
		// 정렬 후 첫번째 수와 마지막 수의 합 : 17
//		System.out.println(정렬 후 첫번째 수와 마지막 수의 합 : "+(nums[0]+nums[4]));
	}
}
