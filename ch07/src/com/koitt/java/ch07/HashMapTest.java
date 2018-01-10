package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
		public static void main(String[] args) {
			HashMap<String, String> hm = new HashMap<String, String>();

			hm.put("대한민국", "서울"); // add대신에 put을 씀. put(K key, V value)
			hm.put("일본", "동경");
			hm.put("중국", "북경");
			hm.put("태국", "방콕");		
			hm.remove("태국"); // 키값을 삭제
			hm.put("중국", "북경");	// 해당 "중국"키값에 있던 기존 데이터를 덮어써서 갱신해버림 
			
			System.out.print("키 : " + hm.keySet()); // key값만 모아서 출력
			System.out.println(" 값 : " + hm.values());
			
			// 아이터레이터 방식을 이용해 값을 꺼내기
			Iterator<String> keys = hm.keySet().iterator();
			while ( keys.hasNext() ) {
				String key = keys.next();
				String value = hm.get(key);
				System.out.println(key + ": " + value);
			}
			
			// for-each문을 이용하기
			for ( String Key : hm.keySet()) {
				String value = hm.get(Key);
				System.out.println(Key + ": " + value);
			}
			
			// key값을 알고 있어서 직접 key값을 입력하여 끄집어 낸다
			String value = hm.get("대한민국");
			System.out.println(value);
		}

}
