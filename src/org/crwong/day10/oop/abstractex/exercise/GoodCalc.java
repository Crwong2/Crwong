package org.crwong.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator{
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		// 배열에서 값을 꺼내서 누적합을 한 후
		// 배열의 크기로 나눠버린다.
		int sum = 0;
//		for(int i = 0; i < a.length; i++) { sum += a[i] }
		for (int num : a) {
			sum += num;
		}
//		return (double) sum / a.length;
		double avg = (double) sum / a.length;
		return avg;
	}
}
