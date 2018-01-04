package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		
		// 케이라는 고양이 생성
		Cat kei = new Cat("케이", 1);
		
		// 주인 만들기
		Cat[] cats = new Cat[2];
		cats[0] = new Cat("일냥이", 3);
		cats[1] = new Cat("이냥이", 2);
		Owner yeEun = new Owner("예은", "서울", cats); // 예은이 kei라는 고양이를 소유한다
		// 주인이 소유한 고양이를 소개하는 메소드 호출
		yeEun.introCat();
		
		
		Cat happy = new Cat("해피", 5);
		Cat[] cats2 = new Cat[3];
		cats2[0] = new Cat("삼냥이", 3);
		cats2[1] = new Cat("사냥이", 2);
		cats2[2] = new Cat("오냥이", 1);
		Owner gildong = new Owner("홍길동", "율도국", cats2);
		
		gildong.introCat();
		
		// 생성자는 한번밖에 쓸 수 밖에 없어 Owner에서 getter setter 만들어주기
		
		// 분양받을 고양이생성
		Cat happy2 = new Cat("해피2호", 1);
		
		// 길동이 새로 고양이를 분양받는다. 
		gildong.setCat1(cats);
		
		// 길동이 새로 분양 받은 고양이를 소개한다.
		gildong.introCat();

	}

}
