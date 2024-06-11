package org.crwong.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {  // 리스트는 순서가 중요하고, 중복을 허용함.

	public static void main(String[] args) {
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList 클래스라고 하면 이것을 사용한다.
		List<String> list = new ArrayList<String>();
		// List:부모타입변수, ArrayList:자식타입변수, 업캐스팅을 이용한다.
		list.add("김만규");
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		list.add("오준석");
		list.add(2, "조승효"); // list.add는 마지막줄에 추가되는 건데,
		// list.add(넣고싶은자리, xxx); 를 해주면 그 자리로 넣을 수 있다.

		System.out.println(list.get(0));
		System.out.println(list.get(5));
		System.out.println("크기 : " + list.size());
		int listSize = list.size() - 1;
		System.out.println("마지막 값 : " + list.get(listSize));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		list.remove(listSize); // 마지막값 지우기
		list.remove(2); // 원하는 자리의 값을 지우기
		list.clear(); // 전체삭제
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("isEmpty() : " + list.isEmpty() + ", size() : " + list.size());
	}

	public void genericSample() {
		// 제네릭을 쓰면 형변환하지 않아도 됌.
		GenericList<String> strList = new GenericList<String>();

		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");

		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		// 강제형변환 하지 않아도 <> generic을 이용해서 편하게 사용할 수 있음.

		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");

		String start = (String) obj.get(0);
		String project = (String) obj.get(1);
		String end = (String) obj.get(2);
		System.out.println(start);
		System.out.println(project);
		System.out.println(end);
	}

	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");

		double start = (double) objList.get(0); // (double) 강제형변환
		int end = (int) objList.get(1);
		// msg로 종강 메세지가 출력되도록 적어보기
		String msg = (String) objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}

	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size()); // .메소드 를 통해서 가져옴.
		nums.clear(); // 모두 삭제
		System.out.println("크기 : " + nums.size());
	}
	
	
}
