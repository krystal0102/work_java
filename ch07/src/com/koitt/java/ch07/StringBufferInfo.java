package com.koitt.java.ch07;

public class StringBufferInfo {
	public static void main(String[] args) {
	StringBuffer pg = new StringBuffer("Java"); //용량 16
	
	System.out.println(pg.capacity()); // 스트링버퍼 안에 있는 배열의 크기 출력
	System.out.println(pg.append(" language")); // 해당 문자열을 마지막에 추가
	System.out.println(pg.insert(5, "programming ")); 
	// 5번째에 문자열을 집어넣음. 이때 이 글자들이 모두 들어갈 수 있는지 계산하고, 
	// 모자랄 경우 글자를 집어넣기 위해 두배로 칸을 늘림. 띄어쓰기 포함
	
	System.out.println(pg.capacity()); // 위에서 용량이 두배로 늘어났으니까 결과는 42
	System.out.println(pg);
	System.out.println(pg.replace(0, 4, "Objective-C"));	// 0~4번째까지의 문자를 빼고 스트링값을 대체함
	System.out.println(pg.substring(0, 9)); // 0~9번째까지의 값을 출력함
	System.out.println(pg);		
	System.out.println(pg.charAt(10)); // 10번째의 문자를 출력
	pg.setCharAt(10, 'D'); // 10번째 자리의 문자를 D로 대체
	System.out.println(pg);	
	}
}
