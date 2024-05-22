package org.crwong.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop7 {
	public static void main(String[] args) {
		// 반복문 실습문제 02
		// 실습문제 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개 입력 : ");
//		int num = sc.nextInt();
//		int multi = 0;
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0 && i % 3 == 0) {
//				System.out.println(i);
//				if ( i % 2 == 0 && i % 3 == 0) {
//					multi++;
//				}
//			}
//		}
//		System.out.println("2와 3의 공배수의 개수 : " + multi);
		// 실습문제 2번
		// /*
		// *
		// * 다음과 같은 실행 예제를 구현하세요.
		// *
		// *ex. 정수 입력 : 3
		// *
		// **
		// ***
		// **
		// *
		// */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력 : ");
		int num = sc.nextInt();
//		char star = sc.next
		for (int i = 1; i < num; i++) {
			System.out.println(i);
		}
	}
}
