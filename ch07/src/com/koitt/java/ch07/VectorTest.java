package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
			// <> -> 제네릭 Generic : 코드를 유연하게 만들기 위해 추가한 기능
			// Object는 최상위이기 때문에 메소드 하나로도 여러 타입을 생성할 수 있음 
		Vector<Object> data = new Vector<Object>(3); // 처음에 만들어지는 배열의 크기: 3
		// Vector data = new Vector(3); //경고발생
		
		data.addElement(2012); // add와 addElement는 기능의 차이는 없음 
		data.add("년도");
		data.addElement(4.35);
		data.add(2, "목표학점");  
		data.insertElementAt("자바강좌", 0); 
		// add(int index, E element)와 insertElementAt(E obj, int index)는 인자 순서의 차이만 있을뿐 기능은 차이가 없음
		System.out.println("size = " + data.size());	// 데이터안에 있는 배열의 크기
		System.out.println("capacity = " + data.capacity());	// 배열의 용량 : 본래 배열용량 3에서 값이 늘어나므로 2배로 키웠기 떄문에 6
		System.out.println(data.toString());
	}

}
