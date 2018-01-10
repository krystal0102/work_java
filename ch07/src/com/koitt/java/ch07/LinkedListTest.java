package com.koitt.java.ch07;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListTest {
	public static void main(String[] args) {
		
		// generic타입을 명시하지 않아서 경고가 뜨는것
		
		List<Object> list = new LinkedList<Object>();
		
		list.add("pascal");		
		((LinkedList<Object>)list).addLast(1);		
		list.add("java");		
		((LinkedList<Object>)list).addLast(3.4); // 맨 뒤에 붙임	
		((LinkedList<Object>)list).addFirst("algol");	// 맨앞에 붙게됨
		((LinkedList<Object>)list).addFirst(0.87); // 그 맨앞에 붙게됨		
		list.add(3, null); // 3번째에 null값을 붙이고 나머지 값들은 arraycopy로 뒤로 밀림	
		((LinkedList<Object>)list).addLast(5.8);		
		
		Iterator<Object> it = list.iterator(); // list에서 iterator 객체를 뽑아냄
		print(it);
		print(((LinkedList<Object>)list).descendingIterator()); // 거꾸로 출력하기
		
		//배열로 반환하여 모든 원소 출력 가능 (for-each)
		for (Object e : list.toArray()) { // 오브젝트타입의 배열이 리턴
			System.out.print(e + " ");			
		}
		System.out.println();
	
	}
	public static void print(Iterator<Object> it) {
		while ( it.hasNext() ) { // hasNext 다음 값이 있는지 물어봄
			System.out.print(it.next() + " "); // next : 값을 꺼냄
		}	
		System.out.println();
	}
	
	

}
