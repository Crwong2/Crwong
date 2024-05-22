package org.crwong.day04.array.practice;

public class Practice_Array4 {
	public static void main(String[] args) {
		// 실습문제4
		// 길이가 5인 String배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"
		// 로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		
		// 내 풀이
//		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
//		System.out.print(fruits[1]);
		
		// 강사님 풀이
//		String [] fruits = new String[5];
//		fruits[0] = "사과";
		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
		
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
	}
}
