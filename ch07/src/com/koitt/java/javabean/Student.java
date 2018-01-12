package com.koitt.java.javabean;

public class Student extends JavaBean {
	
	public static void main(String[] args) {
		
		JavaBean bo = new JavaBean("박보검", 123456);
		JavaBean eun = new JavaBean("차은우", 123456);
		
		// equals 사용
		if (bo.equals(eun)) {
			System.out.println("두 사람의 학번은 같습니다");
		}
		else {
			System.out.println("두 사람의 학번은 다릅니다");
		}
		
		// hashCode 사용
		System.out.println(bo.hashCode());
		System.out.println(eun.hashCode());
		
		// toString 사용
		System.out.println(bo);
		System.out.println(eun);
		
		
	}
}
