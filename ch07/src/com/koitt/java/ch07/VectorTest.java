package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
			// <> -> 제네릭 Generic : 코드를 유연하게 만들기 위해 추가한 기능
			// Object는 최상위이기 때문에 메소드 하나로도 여러 타입을 생성할 수 있음 
		Vector<Object> data = new Vector<Object>(3);
		// Vector data = new Vector(3); //경고발생
		
		data.addElement(2012);
		data.add("년도");
		data.addElement(4.35);
		data.add(2, "목표학점");
		data.insertElementAt("자바강좌", 0);
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + data.capacity());
		System.out.println(data.toString());
	}

}
