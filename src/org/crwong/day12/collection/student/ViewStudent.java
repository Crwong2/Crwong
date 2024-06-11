package org.crwong.day12.collection.student;

import java.util.List;
import java.util.Scanner;

public class ViewStudent {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.println("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	public Student[] displayInput() {
		return null;
	}

	public void displayMsg(String msg) {
		System.out.println(msg);
	}

	public Student inputStudent() { // 1. 학생 정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("첫번째 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("두번째 점수 : ");
		int secondScore = sc.nextInt();
		Student std = new Student(name, firstScore, secondScore);
		return std;
	}

	public String inputName(String category) {  // 2. 학생 정보 이름 검색
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}
	
	public void displayStudents(List<Student> stdList) { // 3. 학생 정보 전체 출력
		System.out.println("====== 학생 전체 정보 출력 ======");
		for (Student std : stdList) {
			System.out.printf("\t이름 : %s\n", std.getName());
			System.out.printf("\t1차점수 : %d\n", std.getFirstScore());
			System.out.printf("\t2차점수 : %d\n", std.getSecondScore());
			System.out.println("===============================");
		}
	}

	public Student modifyStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 1차 점수 입력 : ");
		int firstScore = sc.nextInt();
		student.setFirstScore(firstScore);
		System.out.print("수정할 2차 점수 입력 : ");
		student.setSecondScore(sc.nextInt());
		return student;
	}
	
}
