package com.koitt.java.class04;

import com.koitt.java.class03.Cat;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		
		Car[] mini = new Car[3];
		mini[0] = new Car("미", 280);
		mini[1] = new Car("니", 320); 
		mini[2] = new Car("쿠퍼", 340);
		Owner gildong = new Owner("길동",mini);
		gildong.introCar();
		
		System.out.println();
		
		Car[] carrr = new Car[3];
		carrr[0] = new Car("마이바흐", 280);
		carrr[1] = new Car("포르쉐", 320);
		carrr[2] = new Car("람보르기니", 340);
		
		gildong.setMycar(carrr);
		gildong.introCar();
		
		System.out.println();
		
		// 차를 만든다
		Car samsung = new Car("삼성",200);
		// 자동차 배열을 생성한다
		Car[] cars1 = new Car[1];
		// 자동차 배열에 차를 집어넣는다
		cars1[0] = samsung;
		// 생성자를 이용해서 자동차배열을 길동2에게 넣는다
		Owner gildong2 = new Owner("길동이",cars1);
		// 차량 소개
		gildong2.introCar();
		
		System.out.println();
		
		Car morning = new Car("모닝", 170);
		Car[] cars2 = new Car[1];
		cars2[0] = morning;
		gildong2.setMycar(cars2);
		gildong2.introCar();
	
	
	}

}
