package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {
		
		// 강사 sanghoon 생성 - Teacher클래스의 객체(Object)를 생성
		Teacher sanghoon = new Teacher();  // () 빈괄호는 기본생성자를 호출한것
		//[틀]   [객체]
		Teacher changwook = new Teacher("수학");
		Teacher gildong = new Teacher("국어", 3);
		Teacher younghee = new Teacher("영어", 10, "영희선생 어학원");
		
		// sanghoon 의 정보 입력
		sanghoon.setAddress("상도동");
		sanghoon.setAge(32);
		sanghoon.setGender("남");
		sanghoon.setGroup("KOITT");
		sanghoon.setName("정상훈");
		sanghoon.setSsn("861201");
		sanghoon.setSubject("프로그래밍");
		sanghoon.setYear(1);
		
		// Person print()메서드를 호출해보자
		sanghoon.print();		 // Person print()메서드 호출
		sanghoon.print(); // Teacher의 printTeacher()메서드 호출
		
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
		
		// (default) 접근 제한자로 변경 시 발생하는 문제. 자바의 객체지향에 위배됨.
		// sanghoon.ssn = "801201";
		// System.out.println("주민등록번호 날조 : " + sanghoon.ssn);
		
		// 외부에서 날조를 예방하는 방법 (멤버변수에 바로 접근할 수 있다 없다..!)
		sanghoon.setSsn("801201");
		System.out.println("주민등록번호 날조  : " + sanghoon.getSsn());
		
	}

}
