package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

public static void main(String[] args) {
		
		Car kia = new Car("기아",300);
		Owner gildong = new Owner("길동",kia);
		gildong.introCar();
		
		Car samsung = new Car("삼성",200);
		Owner gildong2 = new Owner("길동이",samsung);
		gildong2.introCar();
	
	
	}

}
