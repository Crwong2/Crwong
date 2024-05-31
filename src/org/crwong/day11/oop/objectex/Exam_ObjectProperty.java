package org.crwong.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;

	public Member() {
	} // 1. 기본생성자는 필수로 만들고!

	// 매개변수를 넣어서 public Member가 듀플리케이트 오류 안나게 하는것=오버로딩
	// 2. 필요한 생성자가 있으면 매개변수 있는 생성자를 만들어서 쓰자!
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
//		return super.toString(); // object의 toString을 리턴하겠다
		return "이름 : " + name + ", 나이 :" + age + ", 이메일 :" + email + ", 전화번호 : " + phone + ", 주소 : " + address;
	}
}

public class Exam_ObjectProperty {

	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		// 의미있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수!
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
//		System.out.println("객체 출력 : " + obj); // toString() 생략 가능함.
		// 객체를 출력하면 toString()의 결과로 출력됨
	}

	public static void main(String[] args) {
		print(new Member("일용자", 11, "khuser01@naver.com", "01092920303", "서울시 중구"));
		print(new Member());

		String javaStr = "Java"; // 1
		String javaStr2 = new String("Java"); // 2 이 "Java"는 다른 주소를 갖는다.
		String javaStr3 = "Java";
		// 문제
		// if(javaStr == javaStr3) { -> ?? true / "Java"는 재사용되었기 때문에 둘의 주소는 같다.(feat.상수풀)
		// if(javaStr3 == javaStr2) { -> ?? false / new String으로 재정의 되었기 때문에 주소가 다르다.
		// if(javaStr3 == "Java") { -> ?? true    /  저장되어있던 "Java"가 사용되기 때문에 true
		// if(javaStr == "javA") { -> ?? false  / 문자가 다르므로 같지않다.
		System.out.println("javaStr : " + javaStr + ", javaStr2 : " + javaStr2);
		if (javaStr2 == "Java") { // 1 "Java"는 같은 주소를 갖고,
//			if(javaStr2.equals("Java")) {
			if ("Java".equals(javaStr2)) { // 문자열 비교는 equals
										   // equals는 Object클래스의 메소드
				System.out.println("똑같습니다.");
			} else {
				System.out.println("다릅니다.");
			}
		}
	}
}
