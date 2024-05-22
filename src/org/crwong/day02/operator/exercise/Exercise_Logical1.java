package org.crwong.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		// 연습문제 2-1
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 1 ~ 100 사이의 숫자를 입력하세요 : 32
		// 1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
		int inVal = sc.nextInt();
		boolean result;
		result = (0 < inVal) && (inVal <= 100);
		System.out.println("1부터 100사이의 숫자인가? " + result);
	}
}