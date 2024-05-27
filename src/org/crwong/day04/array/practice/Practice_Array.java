package org.crwong.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		// 실습문제1
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	
		//내 풀이
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
//			System.out.print((i+1) + " ");
		}
		//강사님 ver
//		int [] nums = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			nums[i] = (i+1);
//			System.out.print(nums[i]+ " ");
//		}
	}
	
	public void practice2() {
		// 실습문제2
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		int [] nums = new int[10];
//		for (int i = 0; i < 10; i++) {
//			nums[i] = (10-i);
//			System.out.print(nums[i] + " ");
//		}
		
		// 강사님 풀이
		int [] nums = new int[10];
//	    int count = 10;
	    for (int i = 0, count = 10; i < 10; i++, count--) {
	    	nums[i] = count;
//	    	count--;
	    }
	    for (int i = 0; i < 10; i++) {
	    	nums[i] = 10-i;
	    }
	    for(int i = 0; i < 10; i++) {
	    System.out.print(nums[i]+ " ");
	    }
	}
	
	public void practice3() {
		// 실습문제3
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		//내 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input  = sc.nextInt();
		int [] nums = new int[input];
		for (int i = 0; i < input; i++) {
			nums[i] = i + 1;
			System.out.print(nums[i] + " ");
		}
//		for (int i = 0; i < input; i++) {
//			System.out.print(nums[i] + " ");
//		}
		System.out.println();
		// 강사님 풀이
//		Scanner sc = new Scanner(System.in);
//		System.out.print("양의 정수 : ");
//		int input = sc.nextInt();
		
		if(input > 0) {  // 입력받은 값이 0보다 큰지 체크
			int [] arrs = new int[input];        // 입력받은 값으로 배열 크기 할당
			for(int i = 1; i <= input; i++) {    // 
				arrs[i-1] = i;
				System.out.print(arrs[i-1]+ " ");
			}
			System.out.println();
			
			for(int i = 0; i < input; i++) {
				arrs[i] = i + 1;
				System.out.print(arrs[i] + " ");
			}
		}
	}
	
	public void practice4() {
		// 실습문제4
		// 길이가 5인 String배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"
		// 로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		
		// 내 풀이
//		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
//		System.out.print(fruits[1]);
		
		// 강사님 풀이
//		String [] fruits = new String[5];
//		fruits[0] = "사과";
		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
		
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = sc.next();
		// 입력받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		int count = 0;
		int size = object.length(); // "문자열".length()하면 ""안에 문자열의 길이가 구해짐. 이 경우에 3이 나옴
		char[] words = new char[size]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		for (int i = 0; i < object.length(); i++) {
			words[i] = object.charAt(i); // "문자열".charAt(0)하면 ""안에 문자열 중 0번째에 해당하는 문자를 가져옴. 이 경우에 '문'이 구해짐
		}
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0); // 입력한 문자열에서 무조건 첫번째 문자를 구해줌.
		System.out.print(object + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < words.length; i++) { // 배열.length 하면 배열의 크기가 구해짐. 배열이면 다 가능.
			if (words[i] == search) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(search + " 개수 : " + count);
//		words[0] = object.charAt(0);
//		words[1] = object.charAt(1);
//		words[2] = object.charAt(2);    // 이러한 작업을 문자열의 길이만큼 반복해야함.
//		words[3] = object.charAt(3);    
//		words[4] = object.charAt(4);   
//		words[5] = object.charAt(5);    
		// 그 배열에 검색한 문자가 있는지 어떻게 처리할 것인가?
	}
	
	public void practice6() {
		// 실습문제6
		// "월" ~ "일" 까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		if(num < 0 || num > 6) {
//			System.out.println("잘못 입력하셨습니다");
//		}else {
//			char [] weeks = {'월', '화', '수', '목', '금', '토', '일'};
//			System.out.println(weeks[num]+"요일");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
			System.out.print("잘못 입력하셨습니다");
		} else {
			String [] weeks = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
			System.out.print(weeks[num]);
		}
	}
	
	public void practice7() {}
	
	public void practice8() {}
	
	public void practice9() {}
	
	public void practice10() {
		// 주민등록번소 성별자리 이후부터 *로 가리고 출력하세요.
		// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char [] idNums = new char[idNum.length()];
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length];
		for(int i = 0; i < idNums.length; i++) {
			//copy[i] = idNums[i];
			if(i < 8) {
				copy[i] = idNums[i];
			}else {
				copy[i] = '*';
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}
	}
	
	public void practice11() {}
	
	public void practice12() {}
	
}
