package org.crwong.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// 문제1
		// 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt();
		
		if(grade < 4 && score >= 60) {
			// 합격 출력
			System.out.println("합격입니다.");
		}else if(grade == 4 && score <=70) {
			// 불합격 출력
			System.out.println("불합격입니다.");
		}else {
			// 불합격 출력
			System.out.println("불합격입니다.");
		}
		
		
		if(grade != 4) {
			if(score >= 60) {
				// 합격 출력
				System.out.println("합격입니다.");
			}else {
				// 불합격 출력
				System.out.println("불합격입니다.");
			}
		}else {   // 여기의 else는 grade != 4 의 if에 대한 else 이므로 아래의 내용은 grade == 4 에 대한 내용이다.
				if(score >= 70) {
					// 합격 출력
					System.out.println("합격입니다.");
				}else {
					// 불합격 출력
					System.out.println("불합격입니다.");
				}
			}
		}
	}
