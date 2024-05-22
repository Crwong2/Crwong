package org.crwong.day04.control.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String[] args) {
		// 0시 0분부터 23시 59분까지 출력하기

		// tip 한번에 하기 어려울때 나눠서 처리하고 합치자
		// 시 에대한 for문, 분 에대한 for문 작성후 합치자
		for (int i = 0; i < 24; i++) {
//			System.out.println(i+ "시");
			for (int j = 0; j < 60; j++) {
				System.out.println(i + "시 " + j + "분");
			}
		}
	}
}
