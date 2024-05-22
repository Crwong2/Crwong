package org.crwong.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는30입니다.
		// a : 10, b : 20, c : 30
		// a++;
		// a: 11, b : 20, c : 30
		// b = (--a) + b;
		// a : 10, b : 30, c : 30
		// c = (a++) + (--b); // 10 + 29
		// a : 11, b : 29, c : 39
		// 실습문제1
		// 정수형 변수 a, b, c 3개를 만든 후 각각 10, 20, 30을 입력받아, 다음 연산을 수행하는 식을 작성하고 a, b, c의 결과값을 출력하세요
		// a++, b = (--a) + b, c = (a++) + (--b)
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
//		c = (a++) + (--b);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		// 문제2
		// x는 100, y는 33, z는 0
		// x--;               ---> x : 99, y : 33, z : 0
		// z = x-- + --y;     ---> z = 99 + 32 = 131        -> x : 98,  y : 32, z : 131
		// x = 99 + x++ + x;  ---> x = 99 + 98 + 99 = 296   -> x : 296, y : 32, z : 131
		// y = y-- + y + ++y; ---> y = 32 + 31 + 32 = 95    -> x : 296, y : 95, z : 131
		// x : ? y : ? z : ?  ---> x : 296, y : 95, z : 131
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}

}
