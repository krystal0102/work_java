package com.koitt.java.ch07;

public class WrapperInteger {
	public static void main(String[] args) {
		Integer age = new Integer(20);
		Integer snum = new Integer("20121105");	// String이지만 내용이 숫자인경우 int로 출력해준다
		
		System.out.println("나이: " + age.intValue()); // 내부의 값을 int값으로 반환해줌
		System.out.println("학번: " + snum.intValue());
		System.out.println(age.equals(snum)); // Object클래스에 있는 equals를 Integer 클래스에서 오버라이딩을 통해 재정의 
		
		System.out.println(Integer.parseInt("24567")); // String으로 받은 값을 int로 바꿔줌( 출력 시 기본값은 10진수)
		System.out.println(Integer.parseInt("ff", 16)); // (String,진수) ff의 16진수로 읽어서 int형으로 변환
		System.out.println(Integer.toBinaryString(255));// ()값을 이진수로 바꿔서 스트링 타입으로 출력
		System.out.println(Integer.toString(255, 16)); // int를 16진수로 바꾼걸 String으로 출력 <-> parseInt
	}

}
