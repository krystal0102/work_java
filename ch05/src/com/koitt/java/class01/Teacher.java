package com.koitt.java.class01;

public class Teacher extends Person {

		/*  Animal과 Person의 필드값을 상속
		 *  중복작성하지 않아도 됨
		 */
	private String subject; // 담당과목
	private int year;		// 강의 경력
	private String group;	// 소속
	
	
	/*// 기본 생성자 (Default Constructor)
	 * 만약 구현된 생성자가 없다면 컴파일러가 기본 생성자를 자동으로 생성한다.
	 * 리턴타입x. 접근제한자와 멤버변수로 이루어짐
	 */
	public Teacher() {
		
	}
	
	// 다형성(polymorphism)의 예 : 클래스명이 똑같아도 다양한 타입으로 사용할 수 있음
	// 메서드 오버로딩( Method Overoading) : 상속과 관련 없이 같은 이름으로 생성자 여러개를 만들 수 있음

	// 필드 subject만 초기화 하는 생성자
	public Teacher(String subject) {
		this.subject = subject;		
	}
	
	// 필드 subject, year만 초기화하는 생성자
	public Teacher(String subject, int year) {
		this.subject = subject;
		this.year = year;
	}
	
	// 필드 전체를 초기화하는 생성자
	public Teacher(String subject, int year, String group) {
		this.subject = subject;
		this.year = year;
		this.group = group;
	}
	
	
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	// 다형성 - 메서드 오버라이딩 (Method Overriding) : 상속관계 성립되야함. 부모와 자식 클래스에 같은 메서드가 있을때 자식클래스를 구현함
	// 		   메서드 재정의
	@Override // 오버라이딩을 했다는 표시를 위한 애노테이션(Annotation). 구별하기 위한 용도 + 붙여봤을때 해당 메서드가 오버라이딩 되었는지 아닌지 판별가능
	public void print() {
		System.out.println("주민등록번호 : " + this.getSsn() + ", 주소 : " + this.getAddress() +  ", 과목 : " + this.subject + ", 강의년수 : " + this.year);
	}
	

}
