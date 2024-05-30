package org.crwong.day10.oop.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
		// 회원관리 프로그램
		// 1. 회원가입
		// 2. 회원검색
		// 3. 회원정보보기
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end: 
			while (true) {
			int menu = view.printMenu(); // viewMember클래스의 return sc.nextInt();를 가져와서 무한반복.
			switch (menu) {
			case 1: // 회원가입
				Member member = view.inputMember();
				mng.registerMember(member);
				break;
			case 2: // 회원 아이디로 검색
				// 아이디 입력
				String memberId = view.inputMemberId();
				//배열에서 찾기
				member = mng.searchOneById(memberId);
				//찾은거 출력하기
				if(member != null)
				view.displayMember(member);
				break;
			case 3: // 회원 전체정보 조회
//				member = mng.allMember();
//				view.displayMember(member);
				Member[] members = mng.allMember();
				view.displayMemberList(members);
				break;
			case 4: // 종료
//				System.out.println("프로그램을 종료하겠습니다.");
				view.printMessage("프로그램을 종료하겠습니다.");
				break end;
			default: // 예외
//				System.out.println("잘못 입력하셨습니다.");
				view.printMessage("잘못 입력하셨습니다.");
			}
		}

		// 3. 회원정보수정
		// 4. 회원정보삭제
	}
}
