package org.crwong.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	public static void main(String[] args) {
		// 실습문제 4번
		// 사용자로부터 두 개의 값을 입력받아
		// 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요"를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		if (num1 < 1 || num2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//		} else {
//			int start, end;
//			if (num1 < num2) {
//				start = num1 +1;
//				end = num2;
//			} else {
//				start = num2 +1;
//				end = num1;
//			}
//			for (int i = start; i < end; i++) {
//				System.out.println(i);
//			}
//		}
		
// 강사님 ver
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = sc.nextInt();
		// num1 과 num2 중 1 미만의 숫자가 입력되었는지 체크
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			// 입력된 두개의 값중 작은값은 초기식에, 큰 값은 조건식에 입력되도록 만들어보세요
			// 힌트 : min, max를 사용하는 방법도 있음.
			int min = 0, max = 0;
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			for(int i = min+1; i < max; i++) { // num1이 무조건 num2 보다 작다고 가정
				System.out.print(i + " ");
			}
//			System.out.println();
//			for(int i = num1; i <= num2; i++) {
//				System.out.print(i + " ");
//			}
		}
	}
}
