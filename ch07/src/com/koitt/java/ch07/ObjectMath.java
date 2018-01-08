package com.koitt.java.ch07;

public class ObjectMath {
	public static void main(String[] args) {
		
		Object obj = new Object();
		// 오브젝트 객체에 있는 메소드를 전부 출력해봄
		System.out.println(obj.getClass()); 	// 클래스의 전체 이름
		System.out.println(obj.hashCode());		// 가짜 주소값
		System.out.println(obj.toString());		// 직접 가서 살펴보자~
		
		// Matn m = new Math();					// 오류발생 : Math라는 클래스의 메소드들은 static으로 구성
												//			따라서 객체생성xx 아래와 같이 .블라블라 로 사용
		System.out.println(Math.PI);
		System.out.println(Math.round(-3.5));	// 반올림
		System.out.println(Math.abs(-3.4));		// 절대값
		System.out.println(Math.pow(3, 4));		// 3의 네제곱
		
	}

}
