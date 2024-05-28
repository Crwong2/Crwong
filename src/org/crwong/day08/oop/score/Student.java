package org.crwong.day08.oop.score;

import java.util.Scanner;

public class Student { // 클래스를 나누기 위해ScoreProgram2에서
					   // 값을 가져옴
	// 멤버 필드
	int kor;
	int eng;
	int math;
	
	// 생성자
	public Student() {}
	
	// 멤버 메소드
	// 메뉴 출력
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
	// 성적 입력
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	// 성적 출력
	public void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " +(kor+eng+math));
		System.out.println("평균 : " +(kor+eng+math)/3.0); 
		
	}
	// 메세지 출력
	public void displayMsg(String message) {
//		message = "프로그램을 종료합니다.";
		System.out.println(message);
	}
}
