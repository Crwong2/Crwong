package org.crwong.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		// while문을 이용하여 -1이 입력될때까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 값 : 1
		// 값 : 2
		// 값 : -1
		// 값 : 3
		// 정수를 10번 입력받아서 합을 출력하는 프로그램 부터 만들어보자.
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;

//		int val = 0;
//		
//		while(val >= 0) {
//			System.out.print("정수를 입력하세요 : ");
//			val = sc.nextInt();
//			sum += val;
//		}
		int lastNum;
		System.out.print("정수를 입력하세요 : ");
		while ((lastNum = sc.nextInt()) != -1) {
			sum += lastNum;
		} // 스트링에서 이 형태의 무한반복문 사용
			///////////////////////////////////////////////
		sum = 0;
		int val;
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			val = sc.nextInt();
			if (val == -1)
				break;
			sum += val;
		}
		System.out.println("총합 : " + sum);
		/////////////////////////////////////////////
		sum = 0;
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		while (input != -1) {
			sum += input;
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();
		}
		System.out.println("총합 : " + sum);
		/////////////////////////////////////////////
		sum = 0;
		while (i < 10) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == -1)
				break;
			sum += num;
			i++;
		}
		System.out.println("총합 : " + sum);
	}
}
