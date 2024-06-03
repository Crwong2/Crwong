package org.crwong.day12.collection.set;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	@Override
	public String toString() { // toString을 가지고 있는 클래스는 Student의 부모,extends된 클래스가 없다면, 모든 클래스의 부모는 Object
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
	@Override
	public int hashCode() {
		return(this.name+this.firstScore+this.secondScore).hashCode();
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode();
		}else {
			return false;
		}
//		if(name.equals(std.getName()) 
//			&& firstScore == std.getFirstScore()
//			&& secondScore == std.getSecondScore()) {
//			return true;
//		}else {
//			return false;
//		}
//		return super.equals(obj);
	}
}
