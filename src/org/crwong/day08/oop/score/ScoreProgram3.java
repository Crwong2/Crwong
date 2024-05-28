package org.crwong.day08.oop.score;

public class ScoreProgram3 {  // Student클래스에서 입력값을 가져옴.
	public static void main(String[] args) {
		 Student student = new Student();
		end :
		while(true) {
		    int choice = student.printMenu();
			switch(choice) {
			case 1 :
				student.inputScore();
				break;
			case 2 :
				student.printScore();
			case 3 :
				student.displayMsg("프로그램을 종료합니다.");
				break end;
			default :
				student.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
			
	}
}
