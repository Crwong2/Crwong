package org.crwong.day09.oop.inheritance;

import org.crwong.day09.oop.inheritance.point.Point;

class Super {
	public int pub;
	int def;       // default
	protected int pro;
	private int pri;
}

class Sub extends Super{
	void set() {
		Super sup = new Super();
		sup.pro = 23;
		super.pub = 24;
		super.def = 5;
		super.pro = 7;
//		super.pri = 1024;  // is not visible 왜? private 이니까.
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24; // public 이니까
//		p.def = 57; // default 는 같은 패키지에서만 가능
//		p.pro = 10; // protected는 같은 패키지 또는 상속일 때 가능
//		p.pri = 23; // 당연히 안됨. private 이니까.
		
		super.pub = 2024;
//		super.def = 15;
		super.pro = 23;  //  상속받았기 때문에 다른 패키지여도 가능.
//		super.pri = 123;

		
	}
}
public class Exam_Protected {

}
