package com.koitt.java.class01;

public class Person extends Animal {

		//부모 Animal의 필드를 상속 받아 중복으로 작성하지 않아도 사용할 수 있음
		
		private String ssn; 	// 주민등록번호 -> 00년생의 경우 int로 표현할 수 없으니까 String 사용
		private String address; // 주소
		
		public String getSsn() {
			return this.ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		

}
