package com.koitt.java.class02;

// Child 클래스는 Parent 클래스를 상속받는다
public class Child extends Parent {

	// Child 클래스의 생성자
	public Child() {
		// super(); 부모의 기본생성자 호출. 작성을 안하면 컴파일러가 자동으로 추가한다~~~!~~!~
		System.out.println("Child() 기본 생성자 호출...");
	}
	
	public Child(String msg) {
		System.out.println("Child(String msg) 생성자 호출.../" + msg);
	}	
	
	public Child(int num) {
		this("화이팅!"); // 자기 자신의 생성자 중에서 적합한 형식을 찾아 호출함. 따라서 위의 String타입으로 구현됨
						// 또한 위에서 super(); 가 존재하므로 이 생성자에서는 super();를 또 사용하지 않는다
		System.out.println("Child(int num) 생성자 호출.../" + num);
	}
	

}
