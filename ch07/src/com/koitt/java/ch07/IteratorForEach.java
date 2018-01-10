package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForEach {
	// Iterater를 이용해서 for-each문이 만들어지는 원리
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		
		// for-each
		// array 하나하나의 값을 item에 저장하여 씀
		for ( int item : array ) {
			System.out.println(item);
		}
		
		
		// for-each문의 원리 : iterater
		for (Iterator<Integer> i = array.iterator(); i.hasNext();) {
			Integer item = i.next();
			System.out.println(item);
		}
		
	}
}
