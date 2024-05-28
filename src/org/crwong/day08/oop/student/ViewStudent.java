package org.crwong.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {
	public int printMenu() { // void 대신에 choice를 선언한 int를 써야함
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	public void displayMsg(String message) {
//		message = "프로그램을 종료합니다.";
		System.out.println(message);
	}
}
