package com.koitt.java.ch06;

// java는 상속을 하나의 클래스만 받을 수 있다
// + C언어는 다중상속~
public class Motor extends Vehicle {
	
	public String name = "자동차"; // vehicle에서 name이 설정되어있지만 하위클래스에서 재선언함으로써 name은 "자동차"를 값으로 인식
								  // 부모인 vehicle의 값을 그대로 쓰고 싶다면 해당 문장을 삭제하면됨
	public int displacement;
	
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setSeater(int seater) {
		this.seater = seater;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km");
		System.out.print("정원: " + seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] args) {
		
		Motor myCar = new Motor();
		myCar.setMaxspeed(300);
		myCar.setSeater(2);
		myCar.setDisplacement(3500);
		myCar.printInfo();
		
	}

}
