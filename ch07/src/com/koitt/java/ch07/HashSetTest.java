package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(3);	
		setA.add(5);	
		setA.add(7);
		setA.add(8);	
		setA.add(7);	// set은 중복을 허용하지 않기 때문에 중복되는 7은 출력되지 않음 	
		setA.add(9);
		
		System.out.print("A = ");
		print(setA);
		// println에서 자동으로 Argument로 전달받은 객체의 toString메소드를 호출한다
		System.out.println("  A = " + setA);	// HsahSet객체 자신을 뽑아냄
		
		setB.add(5);	// set은 오름차순으로 정렬 ( List는 넣은 순서대로 정렬함)
		setB.add(3); 	
		setB.add(2);
		
		System.out.print("B = ");
		print(setB);
		System.out.println("  B = " + setB);
		
		boolean isChanged = setA.removeAll(setB);	// A에서 B내용을 전부를 뺐을때 A의 값이 바뀌니까(바꼈으니까) true 
		System.out.print("A - B = ");
		
		if (isChanged) {
			System.out.println(setA);
		}
		
		// for-each문
		System.out.print("for-each문으로 출력: ");
		for (Integer i : setA) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void print(Set<Integer> setA) {
		
		// Iterator는 get이 없기 때문에 Iterator객체나 for-each문을 이용해서 순차적으로 값을 뽑아냄
		
		Iterator<Integer> i = setA.iterator();	
		while ( i.hasNext() ) 
			System.out.print(i.next()+ " ");
	}
}
