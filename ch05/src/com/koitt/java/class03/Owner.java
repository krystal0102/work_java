package com.koitt.java.class03;

// Owner은 Cat을 한마리씩 가질 수 있다.

public class Owner {
	
	private String name;	 // 주인이름
	private String address;	 // 주인의 주소
	private Cat[] cat1;		// 주인이 소유한 고양이
	// 한 주인이 여러 고양이를 소유하게 하기 위해 배열 사용하기
	
	// 위 생성자 세 개를 초기화
	public Owner(String name, String address, Cat[] cat1) {
		this.name = name;
		this.address = address;
		this.cat1 = cat1;
	}
	
	
	
	public Cat[] getCat1() {
		return cat1;
	}



	public void setCat1(Cat[] cat1) {
		this.cat1 = cat1;
	}



	// 소유하고 있는 고양이 소개하는 메소드 구현
	public void introCat() {
		for (int i = 0; i < cat1.length; i++) {
		System.out.println("나의 고양이는 " +cat1[i].getName()+ "이고 "+cat1[i].getAge()+"살입니다.");
		}
		System.out.println("그래서 총 "+cat1.length+"마리입니다.");
	}
	
}
