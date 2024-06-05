package org.crwong.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageStudent implements ManageInterface {

	private List<Student> sList;

	public ManageStudent() { // sList
		sList = new ArrayList<Student>(); // List: 부모타입변수, ArrayList: 자식타입변수, 업캐스팅을 통해
	}

	@Override
	public void registerStudent(Student student) { // 1. 학생정보 입력할때 저장할 값
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) { // 2. 학생 정보 이름 검색할때 불러올 값
		if (name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for (Student std : sList) {
				if (name.equals(std.getName())) {
					// 찾았다!!
//					List<Student> searchList = new ArrayList<Student>(); // 이 위치에 있으면 for문이 돌때마다 new로 초기화 되므로 
//											   찾았던 기존 데이터가 날아가고 계속 한개만 들어가고 끝난다.
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}

	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					return std;
				}
			}
		}
		return null;
	}
	
//	public String checkPass(Student student) {
//		int first = student.getFirstScore();
//		int second = student.getSecondScore();
//		// 평균이 60점이 넘으면 통과
//		// 평균이 60점이 안되면 재평가
//		double avg = (first+second)/(double)2;
//		if(avg >= 60) {
//			if(first < 40) {
//				System.out.println("1차 시험 재평가");
//			}else if(second < 40) {
//				System.out.println("2차 시험 재평가");
//			}else {
//				System.out.println("모두 통과입니다.");
//			}
//		}else {
//			if(first < 60) {
//				System.out.println("1차 시험 재평가");
//			}
//			if(second < 60) {
//				System.out.println("2차 시험 재평가");
//			}
//		}
//		return null;
//	}

	@Override
	public List<Student> selectAllStudents() {
//		if(sList.isEmpty()) {  // studentRun case3 에서 if(stdList != null) 을 써서 else문이 발동되고 싶을때 이렇게 하면됨.
//			return null;
//		}
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
//		sList.add(student);
		sList.set(index, student); // case 4 에서 index와 student 둘다 받겠다.
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}

//	public Student searchModifyStudent(String name) {
	public Map<String, Object> searchModifyStudent(String name) {
		if (name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i = 0; i < sList.size(); i++) {
				Student student = sList.get(i);
//			for (Student student : sList) { // 전체에서
				if (name.equals(student.getName())) { // 이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}
	
	public int searchIndexByName(String name) {
		if(name != null) {
//			for(int i = 0; i < sList.size(); i++) {
//				if() return i;
//			}
			int count = 0;
			for(Student student : sList) { // sList에서
				if(name.equals(student.getName())) { // 이름이 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}
}
