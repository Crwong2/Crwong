package org.crwong.day11.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
		ViewMember view = new ViewMember(); // 3번 - 클래스 만듬
		ManageMember mng = new ManageMember();    // 12번 - 클래스 만듬
		exit: 
			while (true) { // 1번 무한반복 메뉴선택
			int choice = view.mainMenu();  // 2번 ViewMember클래스에 mailMenu의 메뉴선택
			switch (choice) {
			case 1:  // 회원가입
				Member member = view.inputMember();   // 7번
				mng.insertMember(member);  // 17번 저장완료
				break;
			case 2:
				// 회원검색(이메일) // 23번
				String email = view.inputEmail("검색"); // 이메일 받아서,  // "검색" 키워드는 30번 이후
				member = mng.searchOneByEmail(email); // manage클래스에서 받고,
				if(member != null)
				view.printOneMember(member);  // view 클래스에서 출력
				else
					view.displayMessage("검색결과가 없습니다.");
				break;
			case 3:
				// 회원 정체정보 출력
				Member [] members = mng.getAllMembers();   // 18번
				view.printAllMembers(members);   // 21번 크리에잇.
				break;
			case 4:
				// 회원정보수정 // 29번
				// 순서2. 수정할 이메일 입력
				email = view.inputEmail("수정"); // 31번
//				String email = view.modifyInput();  // class 생성
				// 순서3. 데이터 확인
				member = mng.searchOneByEmail(email);
				if(member != null) { // 순서4. 있다면   // 32번
					// 순서1. 수정할 값 입력받음 --> 34번
					member = view.modifyMember(email);
					// 순서5. 입력값이 완료되면 수정
					mng.updateMember(member); // 35번
				}
				break;
			case 5:
				//회원 정보 삭제 //27번
				mng.deleteAllMembers();
				break;
			case 0:
				view.displayMessage("프로그램을 종료합니다");  // 5번
				break exit;
			default:
				view.displayMessage("잘못입력하셨습니다."); // 5번
			}
		}
	}
}
