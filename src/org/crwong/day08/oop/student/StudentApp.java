package org.crwong.day08.oop.student;

public class StudentApp {
	public static void main(String[] args) {
		ManageStudent student = new ManageStudent();
		ViewStudent view = new ViewStudent();  // 객체 생성
		end: 
		while (true) {
			int choice = student.printMenu();
			switch (choice) {
			case 1:
				student.inputScore();
				break;
			case 2:
				student.printScore();
				break;
			case 3:
				student.displayMsg("프로그램을 종료합니다.");
				break end;
			default:
				student.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
		// 출력할 코드없음. 끝.
	}
}
