package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {
		
		// 강사 sanghoon 생성 - Teacher클래스의 객체(Object)를 생성
		Teacher sanghoon = new Teacher();
		//[틀]   [객체]
		
		// sanghoon 의 정보 입력
		sanghoon.setAddress("상도동");
		sanghoon.setAge(32);
		sanghoon.setGender("남");
		sanghoon.setGroup("KOITT");
		sanghoon.setName("정상훈");
		sanghoon.setSsn("861201");
		sanghoon.setSubject("프로그래밍");
		sanghoon.setYear(1);
		
		
		// 학생 taehyun 생성 - Student클래스의 객체(Object)를 생성
		Student taehyun = new Student();
		
		// taehyun의 정보 입력
		taehyun.setAddress("서울");
		taehyun.setAge(42);
		taehyun.setGender("남");
		taehyun.setGrade(4);
		taehyun.setMajor("연기과");
		taehyun.setName("차태현");
		taehyun.setSsn("760325");
		taehyun.setStudentId(10);

		// 강사 sanghoon 객체의 정보 출력
		System.out.println("------- 강사 sanghoon의 객체 정보 -------");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());
		
		// 학생 taehyun 객체의 정보 출력
		System.out.println("------- 학생 taehyun의 객체 정보 -------");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());
		
		// 강사 sanghoon의 이름을 변경
		sanghoon.setName("홍길동");
		
		// 학생 taehyun의 나이를 변경
		taehyun.setAge(29);
		
		// 강사 sanghoon 객체의 정보 출력
		System.out.println("------- 강사 sanghoon의 객체 정보 -------");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());
		
		// 학생 taehyun 객체의 정보 출력
		System.out.println("------- 학생 taehyun의 객체 정보 -------");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());
		
		// 코드 가독성이 떨어지며 수정된 부분이 어딘지 찾기도 어려움
		
		
	}

}
