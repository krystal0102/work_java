package com.koitt.java.ch07;

// T: type 
// E: element

public class GenericTest<T> {
	public boolean myEqual (T a, T b) {
		return a.equals(b);
	}

	public static void main(String[] args) {
		String a = "HELLO";
		String b = "HELLO";
		
		Integer c = 1;
		Integer d = 2;
		
		// String타입을 이용하는 myEqual 메소드를 호출할 수 있게 된다
		GenericTest<Object> test = new GenericTest<Object>();
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
		
		// Generic 타입을 Object로 했기 때문에 위의 String과 Integer 모두 가능
		test.myEqual(c, d);
		boolean isEqual2 = test.myEqual(c, d);
		System.out.println(isEqual);
		
	}

}
