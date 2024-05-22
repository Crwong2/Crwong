package org.crwong.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String[] args) {
		// 문제2
		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원입니다.
		// 메뉴를 입력해주세요 : 자바칩프라푸치노
		// 없는 메뉴입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하시겠어요? 가격을 알려드립니다.");
		String menu = sc.next();
		int price = 0;
		switch(menu) {
		case "에스프레소" : 
			price = 2500;
//			System.out.println("2500원입니다");
			break;
		case "카푸치노" :
			price = 4000;
//			System.out.println("4000원입니다");
			break;
		case "카페라떼" :
			price = 3500;
//			System.out.println("3500원입니다");
			break;
		case "아메리카노" :
			price = 3000;
//			System.out.println("3000원입니다");
			break;
		default :
			System.out.println("없는 메뉴입니다");
		}
		if(price !=0)
		System.out.println(price+"원입니다.");
	}
}
