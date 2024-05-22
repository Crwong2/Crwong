package org.crwong.day03.control.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 구하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		
		int i = 1;
		int sum = 0;
		// 합시작
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		// 합 끝
		// 합 출력
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
}


