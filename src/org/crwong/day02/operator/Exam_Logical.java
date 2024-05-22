package org.crwong.day02.operator;

import java.util.Scanner;

public class Exam_Logical {
	public static void main(String [] args) {
		// 논리연산자 예제
		// 남자이면서 평균평점 4.3이상인 사람 -> and &&
		// 컴퓨터공학과 또는 경영학과인 사람 -> or ||
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2);
		System.out.println("결과값1 : " + result1);
		result2 = (num1 < num2) || (num1 == num2);
		System.out.println("결과값2 : " + result2);
		result3 = (num1 > num2) && (num1 != num2);
		System.out.println("결과값3 : " + result3);  // num1 != num2 --> num1과 num2가 같지않으면 트루
		result4 = (num1 > num2) || (num1 == num2);
		System.out.println("결과값4 : " + result4);
		// 연습문제 2
//		1. 50, 30을 입력받아 다음과 같은 식을 작성 하였을때 결과값을 예상해보고 출력해보자.
//				a!=b && a<b
//				a<b || a==b
//				a>b && a!=b
//				a>b || a==b
				boolean result5, result6, result7, result8;
				int a = 50;
				int b = 30;
				result5 = (a != b) && (a < b); // false
				result6 = (a < b) || (a == b); // false
				result7 = (a > b) && (a != b); // true
				result8 = (a > b) || (a == b); // true
				System.out.println("결과값5 : " + result5);
				System.out.println("결과값6 : " + result6);
				System.out.println("결과값7 : " + result7);
				System.out.println("결과값8 : " + result8);
// 		 2. 70, 55를 a,b로 입력받아 다음과 같은 식을 작성 하였을때 결과값을 예상해보고 출력해보자.
//		 a==b || a++<100
//		 a<b && --b<55
//		 a!=b && b--<a++
//		 a++ != b || b++ >=85
//		 a=? b=?
				boolean result11, result22, result33, result44;
				int c = 70;
				int d = 55;
				result11 = (c == d) || (c++ < 100);
				// a : 71, b : 55  result11 : true
				result22 = (c < d) && (--d < 55);
				// a : 71, b : 55 result22 : false  // and의 경우 앞의 결과가 false면 뒤는 연산x
				result33 = (c != d) && (d-- < c++);   
				// a : 72, b : 54 result33 : true 
				result44 = (c++ != d) || (d++ >= 85); 
				// a : 73, b : 54 result44 :  true // or의 경우 앞의 결과가 true면 뒤는 연산x
				System.out.println("c : " + c + " , d : " + d);
				System.out.println("result11 : " + result11 + ", result22 : " + result22 + ", result33 : " + result33 + ", result44 : " + result44);
	}
}
