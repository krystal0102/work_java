package com.koitt.java.ch07;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// Double radius = new Double(2.59);				// JDK 1.5 이전
		Double radius = 2.59;								// boxing : 객체를 만들어서 값을 넣을 필요없이 자동으로 변환시켜쥼
		// double r = radius.doubleValue();					// JDK 1.5 이전
		double r = radius;									// unboxing : 객체를 기본형으로 자동 변환시켜줌
		
		System.out.print("반지름: " + r + ", 원 면적: ");
		System.out.println(radius*radius*Math.PI);
		
		Integer x = 5, y = 3;								// boxing : 일반 상수를 인티져라는 박스에 담음
		System.out.printf("%d + %d = %d %n", x, y, x+y);	// unboxing : 5와3이라는 값을 쓰기 위해 객체에서 기본형으로 자동 변환
		Boolean b = true;									// boxing
		System.out.printf("%b %n", b);						// unboxing
	}
}
