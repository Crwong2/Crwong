package org.crwong.day11.member;

public class ManageMember {

	Member[] members; // 14번
	int index;

	// 필드 초기화를 생성자에서 // 15번
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}

	// 회원정보저장
	public void insertMember(Member member) { // 13번
		if (index < members.length) { // 16번
			members[index] = member;
			index++;
		}
	}

	// 회원 전체정보
	public Member[] getAllMembers() { // 19번
		return members; // 20번
	}

	// 이메일로 회원 검색
	public Member searchOneByEmail(String email) { // 26번
		for (Member member : members) {
			if (member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() { // 28번
		// 다지운다는건 비우는것, 배열을 비운다
		// 어떻게 비울까? 배열을 어떻게 비울까?
		// 초기상태로 만들기
		members = new Member[5]; // 초기화 방법 1번
		index = 0;
//		for(Member member : members) { // 초기화 방법 2번
//			member = null;
//		}
	}

	public void updateMember(Member member) { // 36번
		int i = 0;
		for (Member mOrigin : members) {
			if (mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if (memberEmail.equals(member.getMemberEmail())) { 
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
				members[i] = member;
				}
				i++;
			}
		}
	}
}
