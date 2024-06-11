package org.crwong.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {

	public static void main(String[] args) {

		// Collection의 List, Set, Map-> 저장소
		// 자료구조의 특성에 따라서 선택하여 사용함.
		// Set 순서는 종요하지 않음. 중복을 허용하지 않음
		// -> 중복을 제거할 수 있음.
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("이세훈", 90, 80));
		stdSet.add(new Student("허태성", 88, 44));
		stdSet.add(new Student("남궁성", 78, 67));
		stdSet.add(new Student("이세훈", 90, 80));
		
		System.out.println("크기 : " + stdSet.size());
		
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
		public void setSample() {
		Set<String> strSet = new HashSet<String>(); // new를 해서 상속받은 객체를 사용
		strSet.add("체리");
		strSet.add("딸기");
		strSet.add("사과");
		strSet.add("수박");
		strSet.add("포도");
		strSet.add("딸기");
		
		System.out.println("크기 : " + strSet.size()); // 크기는 5이다. 즉 딸기가 중복이고, Set은 중복을 허용하지 않는다.
		// 실생활 중 중복을 허용하지 않는 것 -> 복권당첨번호, 주민등록번호, 변수이름, ...
		// 수학의 집합 : 순서가 중요하지 않고, 중복을 허용하지 않음.
		// 중복이 있는 데이터들이 있는데 이것을 set에 넣으면 중복이 제거됨.
		// 순서가 있는 경우에는 index를 활용할 수 있으나 set처럼 순서가 없으면 지시자를 활용
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
