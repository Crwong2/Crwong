package org.crwong.day04.array.practice;

import java.util.Scanner;

public class Practice_Array6 {
	public static void main(String[] args) {
		// 실습문제6
		// "월" ~ "일" 까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다");
		}else {
			char [] weeks = {'월', '화', '수', '목', '금', '토', '일'};
			System.out.println(weeks[num]+"요일");
		}
	}
}