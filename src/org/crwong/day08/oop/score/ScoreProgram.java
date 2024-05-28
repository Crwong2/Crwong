package org.crwong.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) { // args <- 전달값을 받는 변수
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		end :
		while (true) {
//		또는 for(;;) {}
			System.out.println("======메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
//			====== 성적 입력 ======
//			국어 : 88
//			영어 : 77
//			수학 : 66
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2:
//			====== 성적 출력 ======
//			국어 : 88
//			영어 : 77
//			수학 : 66
//			총점 : 231
//			평균 : 77.0
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor+eng+math));
				System.out.println("평균 : " + (kor+eng+math)/3.0);
				break;
			case 3:
//			프로그램이 종료되었습니다.
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default:
//			1 ~ 3 사이의 숫자를 입력해주세요.
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
			}

//		if (choice == 1) {
////			====== 성적 입력 ======
////			국어 : 88
////			영어 : 77
////			수학 : 66
//			
//		} else if (choice == 2) {
////			====== 성적 출력 ======
////			국어 : 88
////			영어 : 77
////			수학 : 66
////			총점 : 231
////			평균 : 77.0
//		} else if (choice == 3) {
////			프로그램이 종료되었습니다.
//		} else {
////			1 ~ 3 사이의 숫자를 입력해주세요.
//		}
		}
	}
}
