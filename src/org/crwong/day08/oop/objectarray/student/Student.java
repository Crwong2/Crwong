package org.crwong.day08.oop.objectarray.student;

public class Student {
	String name;
	int firstScore;
	int secondScore;
	
	public Student() {
		
	}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public String toString() {
		return this.name+" 학생의 첫번째 점수는 " 
			+this.firstScore +"점, 두번째 점수는 " 
			+this.secondScore+"점입니다.";
	}
}

//		while (true) {
//			System.out.println("======메인 메뉴 ======");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 종료");
//			System.out.print("선택 : ");
//			int choice = sc.nextInt();
//			switch(choice) {
//			case 1 :    // 성적입력
//				System.out.println("====== 성적 입력 ======");
//				System.out.println("첫번째 점수 : " + math);
//				System.out.println("두번째 점수 : " + eng);
//				break;
//			case 2 :    // 성적출력
//				System.out.println("====== 성적 출력 ======");
//				System.out.println(name + "학생의 첫번째 점수는 " + math + ", 두번째 점수는 " + eng + "입니다.");
//				break;
//			default : 
//				System.out.println("프로그램을 종료합니다.");
//			}
//		}

