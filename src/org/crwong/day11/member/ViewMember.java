package org.crwong.day11.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {     // 4번
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원관리 프로그램 =====");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원 전체정보 조회");
		System.out.println("4. 회원정보수정");
		System.out.println("5. 회원정보삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public void displayMessage(String msg) {  // 5번
		System.out.println(msg);         
	}
	
	public Member inputMember() {  //8번
		Scanner sc = new Scanner(System.in);
		System.out.print("===== 회원가입 =====");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
//		Member member = new member(); //9번 return member; 를 작동하기 위한 작업
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		//11번 new Member r끝에서 ctrl+spacebar -> 2번째것 엔터엔터엔터엔터.
//		member.setMemberName(memberName);      // 9번 얘네들 코드를 줄일 수 있다.
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
//		member.setMemberAddress(memberAddress);
		return member; // 멤버 작업을 해줘야 함.
	}

	public String inputEmail(String category) { // 24번
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "검색할 이메일 입력 : ");
		String email = sc.next();
		return email;
	}
	// 24번 위의 메소드와 합침!
//	public String modifyInput() {  // 30번
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수정할 이메일 입력 : ");
////		String email = sc.next();   // 아래 return sc.next(); 와 동일
////		return email;			    //  
//		return sc.next();
//	}

	public void printOneMember(Member member) { // 25번
		System.out.println("======회원 검색 결과======");
		System.out.println("이름 : " + member.getMemberName());
		System.out.println("전화번호 : " +member.getMemberPhone());
		System.out.println("주소 : " + member.getMemberAddress());
		System.out.println("이메일 : " + member.getMemberEmail());
	}

	public void printAllMembers(Member[] members) {  // 22번
		System.out.println("======회원 전체정보 출력======");
		for(Member member : members) {
			if(member != null) {  // null포인트익셉션이 발생하기 때문에 null이 아닌경우 추가
				System.out.println(member.toString());
			}
		}
	}

	public Member modifyMember(String memberEmail) { // 33번
		// memberEmail = email;
		Scanner sc = new Scanner(System.in);
		System.out.print("===== 회원정보수정 =====");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		return member;
	}
}