package org.crwong.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {
	public static void main(String[] args) {
		// 반복문 실습문제 01
		// 실습문제 1번
		// 사용자로부터 한 개의 값을 입력 받아 
		// 1부터 그 숫자까지의 숫자들을 모두 출력하세요
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 
		// "1 이상의 숫자를 입력해주세요"를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("정수 하나 입력 : ");
//			num = sc.nextInt();
//			if (num < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요");
//			}
//		} while (num < 1);
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
		
// 강사님 ver
//		Scanner sc = new Scanner(System.in);    // 사용자로부터 입력받기 위한 준비
//		System.out.print("정수 입력 : ");  		// 가이드 메세지
//		int input = sc.nextInt();               // 정수하나 입력받기 위한 명령어, 입력받은 후 input에 저장
//		// 1 미만의 숫자가 입력되는지 체크
//		if(input >= 1) {
//			// 1 이상의 숫자가 입력됨
//			// 1부터 입력한 숫자까지의 모든 숫자 출력
//			for(int i = 1; i < input; i++) { // 조건식의 최대값만큼 i가 출력이 되므로 최대값을 입력한 값(input)으로 변경
//											 // 내가 입력한 숫자까지 1부터 출력되게 됨.
//				System.out.print(i + " ");
//			}
//		}else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		// 실습문제 2번
		// 사용자로부터 한 개의 값을 입력받아
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("정수 하나 입력 : ");
//			num = sc.nextInt();
//			if (num < 1) {
//				System.out.println("1 이상의 숫자를 입력하세요");
//			}
//		} while (num < 1);
//		for (int i = num; i >= 1; i--) {
//			System.out.println(i);
//		}
		
// 강사님 ver
//		Scanner sc = new Scanner(System.in); // 사용자로부터 입력받기 위한 준비
//		System.out.print(" 정수 입력 : ");   // 가이드 메세지
//		int input = sc.nextInt();            // 정수하나 입력받기 위한 명령어, 입력받은 후 input에 저장
//		// 입력한 수가 1보다 큰지 체크
//		if(input >= 1) {
//			// 5 4 3 2 1
//			for(int i = input; i >= 1; i--) { // 거꾸로 출력하기 위해 초기값을 1부터 시작하지 않음.
//				System.out.print(i + " ");
//			}
//		}
		
		// 실습문제 3번
		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을
		// for문을 이용하여 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개 입력 : ");
//		int num = sc.nextInt();
//		int sum = 0;
//		if (num < 1) {
//			System.out.println("1 이상의 숫자를 입력하세요");
//		} else {
//			for (int i = 1; i <= num; i++) {
//				sum += i;
//			}
//		}
//		if (num >= 1) {
//			System.out.println("1부터 " + num + "까지의 합 : " + sum);
//		}

// 강사님 ver
		// 정수 하나 입력 : 5
		// 1+2+3+4+5=15 를 for문으로 출력하세요     이래도되고
		// 1부터 5까지의 합 : 15                    이래도되고
		// 총합 : 15                                이래도됨
//		Scanner sc = new Scanner(System.in); // 사용자로부터 입력받기 위한 준비
//		System.out.print(" 정수 입력 : ");   // 가이드 메세지
//		int input = sc.nextInt();            // 정수하나 입력받기 위한 명령어, 입력받은 후 input에 저장
//		// 입력을 받았고 입력받은 값까지 1부터 더해야 함.
//		// 누적함 -> sum 변수 선언!
//		// 누적합식은 sum += i
//		int sum = 0;
//		for(int i = 1; i <= input; i++) { // 1부터 입력한 값까지 증가하며 반복을 해야되기 때문에
//										  // int i = 1; 이고 조건식의 최대값은 입력받은 값(input)이어야 함. i는 증가(i++)
//			sum += i;					  // 1부터 입력한 값까지 더해주는 식
//			if(i != input) System.out.print(i+"+"); // + 로 연결
//			else System.out.print(i+"=");           // 마지막은 =으로 연결
//		}
//		System.out.println(sum);					// 총합 출력1
//		System.out.println("총합 : " + sum);		// 총합 출력2
//		System.out.println("1부터 " + input + "까지의 합 : " + sum); // 총합 출력3
//		System.out.println("1부터 %d까지의 합 : %d\n", input, sum);  // 총합 출력4
		
		// 실습문제 4번
		// 사용자로부터 두 개의 값을 입력받아
		// 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요"를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		if (num1 < 1 || num2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//		} else {
//			int start, end;
//			if (num1 < num2) {
//				start = num1 +1;
//				end = num2;
//			} else {
//				start = num2 +1;
//				end = num1;
//			}
//			for (int i = start; i < end; i++) {
//				System.out.println(i);
//			}
//		}
		
// 강사님 ver
//		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = sc.nextInt();
		// num1 과 num2 중 1 미만의 숫자가 입력되었는지 체크
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			// 입력된 두개의 값중 작은값은 초기식에, 큰 값은 조건식에 입력되도록 만들어보세요
			// 힌트 : min, max를 사용하는 방법도 있음.
			int min = 0, max = 0;
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			for(int i = min+1; i < max; i++) { // num1이 무조건 num2 보다 작다고 가정
				System.out.print(i + " ");
			}
//			System.out.println();
//			for(int i = num1; i <= num2; i++) {
//				System.out.print(i + " ");
//			}
		}
		// 실습문제 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개 입력 : ");
//		int dan = sc.nextInt();
//		if (dan >= 1 && dan <= 9) {
//			for (int i = 1; i < 10; i++) {
//				System.out.println("" + dan + "  * " + i);
//			}
//		}
		
// 강사님 ver
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int dan = sc.nextInt();
//		for(int i = 2; i < 10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//			System.out.println(dan + " * " + i + " = " + dan*i);
//		}
		// 실습문제 6번
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요
		// 단, 9를 초과하는 숫자가 들어오면
		// "9 이하의 숫자만 입력해주세요" 를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개 입력 : ");
//		int dan = sc.nextInt();
//		if (dan >= 1 && dan <= 9) {
//			for (int i = dan; i < 10; i++) {
//				for (int j = 1; j < 10; j++) {
//					System.out.println(i + " * " + j + " = " + (i * j));
//				}
//				System.out.println();	
//			} 
//		}else {
//			System.out.println("9 이하의 숫자만 입력해주세요");
//		}
		
// 강사님 ver
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int dan = sc.nextInt();
//		for(int i = 2; i < 10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//			System.out.println(dan + " * " + i + " = " + dan*i);
//		}
	}
}
