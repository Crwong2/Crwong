package org.crwong.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 { // ScoreProgram을 클래스화 하기 위해 재작업
	
	static int kor;  
	static int eng;   // static은 non-static에 선언한 값을 쓸 수 없다.
	static int math;  // ScoreProgram2 클래스의 멤버필드
	public static void main(String[] args) {
		finish :
		while(true) {
			int choice = printMenu();
//			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					inputScore();
					break;
				case 2 :
					printScore();
					break;
				case 3 :
					displayMsg("프로그램을 종료합니다");
					break finish;
				default :
					displayMsg("1 ~ 3 사이의 수를 입력해주세요");
			}
		}
	}
	private static void displayMsg(String message) {
//		message = "프로그램을 종료합니다.";
		System.out.println(message);
	}
	// ScoreProgram2 클래스의 멤버메소드
	private static void printScore() { // 21번째줄 printScore 에 대한 정보.
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " +(kor+eng+math));
		System.out.println("평균 : " +(kor+eng+math)/3.0); 
		
	}

	private static void inputScore() { //18번째줄 inputScore 에 대한 정보.
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static int printMenu() { // void 대신에 choice를 선언한 int를 써야함
									// 13번째줄 printMenu에 대한 정보
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >> ");
		int input = sc.nextInt();
		return input;  //여기 input값은 13번째줄 printmenu값으로 리턴.
	}
}
