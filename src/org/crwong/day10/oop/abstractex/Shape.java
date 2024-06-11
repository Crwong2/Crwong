package org.crwong.day10.oop.abstractex;

class Line extends Shape {
	@Override
	public void draw() {

	}
}

	// 추상클래스
	// 그냥클래스
public abstract class Shape {
	String name;

	public Shape() {}

	public void paint() {}       // 일반메소드
	public abstract void draw(); // 추상메소드, 있으면 반드시 추상클래스
								 // only be defined by an abstract class
	}

