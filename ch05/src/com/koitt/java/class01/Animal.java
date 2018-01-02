package com.koitt.java.class01;


/* Object 클래스
   JAVA에서 모든 클래스가 기본으로 상속받는 클래스
    이미 기본으로 구현되어 있는 클래스
   extends로 선언하지 않아도 기본으로 상속받는 클래스
   
  
    접근제한자
   - private : 같은 클래스 내부에서만 사용 가능
   - (default) : 같은 패키지 내부에서만 사용 가능
   - protected : default 범위 + 상속 받은 클래스까지 사용 가능
   - public : 어느 곳이든 사용 가능 
   
   getter, setter 
    */
	
	
	public class Animal /*extends Object*/ {
	
		//필드 (Field)
		private String name;

		//메서드 (Method)
		public String getName() {
			// return sanghoon.name;
			return this.name;
		}
		
		// 여기서 this는 객체를 대신하여 쓰임
		public void setName(String name) {
			this.name = name;
		}
		
		
		private int age;
		public int getAge() {
			return this.age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		private String gender;
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}
