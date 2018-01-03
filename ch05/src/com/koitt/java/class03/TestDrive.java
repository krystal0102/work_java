package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		
		// 케이라는 고양이 생성
		Cat kei = new Cat("케이", 1);
		
		// 주인 만들기
		Owner yeEun = new Owner("예은", "서울", kei); // 예은이 kei라는 고양이를 소유한다
		// 주인이 소유한 고양이를 소개하는 메소드 호출
		yeEun.introCat();
		
		Cat happy = new Cat("해피", 5);
		
		Owner gildong = new Owner("홍길동", "율도국", happy);
		
		gildong.introCat();
		

	}

}
