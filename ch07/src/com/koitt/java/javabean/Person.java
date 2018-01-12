package com.koitt.java.javabean;

import java.io.Serializable;

// Java Bean : 아래의 메소드들을 구현한 클래스

public class Person extends Object implements Serializable {
	
	private String name;
	private int age;
	
	// 1. 기본 생성자를 만든다
	public Person() {
		
	}
	// 2. 생성자(필드 전체를 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. getter&setter 구현 -> 보통 생성자 밑에 입력함
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 4. equals 구현 
	@Override
	public boolean equals(Object obj) {
		// 4-1. 나 자신과 Argument의 객체 주소값 비교
		if (this == obj) {
			return true;
		}
		
		// 4-2. obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Person)) {	//obj instanceof Person가 바로 리턴되면 name을 비교하기 전에 프로그램이 종료되므로 !을 붙여줌
			return false;
		}
		
		// 4-3. name필드값이 같다면 같은 객체로 결과를 리턴
		Person p = (Person)obj;
		if (this.name.equals(p.name)) {
			return true;
		}
		return false;
	} 
	
	// 5.HashCode 구현 : 객체 하나를 하나의 숫자로 표현하는 메소드 (가짜 주소값)
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;	
	}
	
	// 6. toString : 객체의 내용을 문자열로 표현하는 메소드
	@Override
	public String toString() {
		// Stirng a = "name = " + this.name + " , age = " + this.age; 와 같은 역할
 		StringBuilder sb = new StringBuilder();
		sb.append("name = ");
		sb.append(this.name);
		sb.append(", age = ");
		sb.append(this.age);
		String a = sb.toString();	// 위에서 append한 문자열을 String타입으로 변환
		return a;
	}
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person("철수", 35);
		Person p2 = new Person("영희", 30);
		Person p3 = new Person("철수", 30);
		
		// 1. equals 사용법 
		if (p1.equals(p2)) {	// 철수와 영희의 이름 비교
		System.out.println("두 사람은 같은 사람입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다.");
		}
		
		 
		if (p1.equals(p3)) {	// 철수와 철수의 이름 비교
			System.out.println("두 사람은 같은 이름입니다.");
		}
		else {
			System.out.println("두 사람은 다른 이름입니다.");
		}
		
		Object o = new Object();
		System.out.println(o.hashCode()); // 가짜 주소값이 출력됨
		
		Object o2 = new Object();
		System.out.println(o2.hashCode());	// o와 o2의 객체가 다르므로 다른 주소값이 출력된다
		
		// 2. hashCode 값을 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		// 3. toString 메소드 사용
		System.out.println(p1.toString());
		System.out.println(p2); 	// println 메소드에서 자동으로 객체의 toString을 호출하므로 생략가능
		System.out.println(p3);
	
	}

}
