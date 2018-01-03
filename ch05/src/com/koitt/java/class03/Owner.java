package com.koitt.java.class03;

// Owner은 Cat을 한마리씩 가질 수 있다.

public class Owner {
	
	private String name;	 // 주인이름
	private String address;	 // 주인의 주소
	private Cat cat1;		// 주인이 소유한 고양이
		
	// 위 생성자 세 개를 초기화
	public Owner(String name, String address, Cat cat1) {
		this.name = name;
		this.address = address;
		this.cat1 = cat1;
	}
	
	// 소유하고 있는 고양이 소개하는 메소드 구현
	public void introCat() {
		System.out.print("나의 고양이는" +cat1.getName()+ "이고 "+cat1.getAge()+"살입니다.");
	}
	
}
