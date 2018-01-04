package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	
	private String name;
	private Car[] mycar;
	
	public Owner(String name, Car[] mycar) {
		this.name = name;
		this.mycar = mycar;
	}
	
	public Car[] getMycar() {
		return mycar;
	}

	public void setMycar(Car[] mycar) {
		this.mycar = mycar;
	}

	public void introCar() {
		for (int i=0; i < mycar.length; i++) {
		System.out.println(this.name + "의 자동차 브랜드 이름은 "+mycar[i].getBrandName()+"이고, 최고속도는 " + mycar[i].getMaxSpeed()+"km/h 입니다." );
		}
	}
	
}
