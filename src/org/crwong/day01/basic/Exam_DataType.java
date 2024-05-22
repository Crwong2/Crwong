package org.crwong.day01.basic;

public class Exam_DataType {
	public static void main(String [] args) {
//		System.out.println("출력하는 코드");
//		기본형
		/*
		 * 정수, 실수, 문자, 문자열, 불린형
		 * 정수 4가지(byte, short, int, long)
		 * 실수 2가지(float, double)
		 * 문자 char
		 * 불린형 boolean
		 * 
		 * 참조형
		 * 문자열  String
		 */
		// 변수 선언 및 초기화(할당)
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
		// 정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l;   // long 의 리터럴 값 맨뒤에 소문자 엘l 을 붙여줘야 오류가 안난다.
		// 실수 part
		float fNum = 23.026f;     // float의 리터럴 값 맨뒤에 소문자 에프 f 를 붙여줘야 한다.
		double dNum = 23.026;
	}
}
