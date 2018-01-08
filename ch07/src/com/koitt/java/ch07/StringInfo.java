package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {
		String snum = "20123458";
		// 생성자 오버로딩
		String name = new String("김경석");
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});
		String java = new String("java");
		
		
		System.out.printf("%d ", snum.compareTo("20123458")); 
		System.out.printf("%d %n", snum.compareTo("20123456"));
		
		System.out.printf("%s ", name);
		System.out.printf("%s ", name.replace('김', '강')); // 문자를 대체하여 반환
		System.out.printf("%s %n", name);
		
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0, 3)); // ^컴^퓨^터^학^과^ ( ^를 0으로 시작해서 카운트. 0번째부터 3번째 사이의 문자출력)
		System.out.printf("%d %n", dept.length());
		
		System.out.printf("%s ", java.indexOf('a')); // ^J^A^V^A^ 문자가 처음 나타나는 처음 값을 반환. 여기선 1번쨰니까 1
		
		System.out.printf("%s ", java.concat(" language")); // 뒤에 스트링 인자를 붙임
		
		System.out.printf("%s ", java.replace('j', 'J')); 
		
		System.out.printf("%s ", java.toUpperCase()); // 전체를 대문자로 바꾼다
		
		System.out.printf("%b ", java.equals("JAVA")); // 비교. 대소문자도 구분하기때문에 결과는 false
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA")); // 대소문자를 구분하지 않고 비교. 따라서 true
		
		System.out.printf("%s %n", java.substring(1)); // ^j^a^v^a^ 1번쨰부터 출력 
		
		
		
		
		
		
	}

}
