package com.koitt.java.class01;


/* Object 클래스
   JAVA에서 모든 클래스가 기본으로 상속받는 클래스
    이미 기본으로 구현되어 있는 클래스
   extends로 선언하지 않아도 기본으로 상속받는 클래스
   
  
    접근제한자
   private 해당 클래스에서만 쓸 수 있도록 제한해줌 
    다른 클래스에서는 접근할 수 없음
   public 
   
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
