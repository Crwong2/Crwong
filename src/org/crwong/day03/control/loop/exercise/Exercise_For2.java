package org.crwong.day03.control.loop.exercise;

public class Exercise_For2 {
	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
//		sum = 1;
//		sum = 1+2;
//		sum = 1+2+3;
//		sum = 1+2+3+4;
//		sum = 1+2+3+4+5;
//		sum = 1+2+3+4+5+6;
//		sum = 1+2+3+4+5+6+7;
//		sum = 1+2+3+4+5+6+7+8;
//		sum = 1+2+3+4+5+6+7+8+9;
//		sum = 1+2+3+4+5+6+7+8+9+10;
		int i;
		for (i = 1; i <= 10; i++) {
//		sum = sum + i;
			sum += i;
			if (i <= 9)
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
		}
		System.out.println(sum);
//			System.out.println("1+");
//			System.out.println("2+");
//			System.out.println("3+");
//			System.out.println("4+");
//			System.out.println("5+");
//			System.out.println("6+");
//			System.out.println("7+");
//			System.out.println("8+");
//			System.out.println("9+");
//			System.out.println("10+");
	}
}
