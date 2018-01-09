package com.koitt.java.ch07;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class DateTest {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now); // 객체가 생성된 시점의 시간을 출력
		System.out.println(now.getTime()); // 1970년 이후부터 지금까지 천분의1초
		
		// getDate타입의 인스턴스 변수를 데이트포맷에게 줌(LONG 날짜 긴타입으로 표시, 한국표준시간)
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA); 
		System.out.println(df.format(now));
										// ( 날짜 LONG타입으로 표시, 시간LONG타입, 한국표준시간)
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now)); 
		System.out.println();
		
		// 1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성
		Date when = new Date(100_000_000_000L); // 1970년 1월 1일 이후 1억초 지난 시간~. 초를 저장하기 떄문에 각 나라별 표준시간대로 표현가능
		System.out.println(when + " == " + (Date)when.clone()); // clone -> 다른 주소값으로 객체를 복제해줌
		System.out.println(when.before(now)); 	// when이라는 시간이 now라는 보다 이전인지 검사. 이전이면 true!
		System.out.println(when.equals(now));	// when과 now가 실제날짜가 같은지 비교
		System.out.println(when.compareTo(now)); // when과 now를 비교했을때 when>now 면 +1, when<now 면 -1, 같으면0
	}

}
