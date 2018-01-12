package com.koitt.java.javabean;

import java.io.Serializable;

public class JavaBean extends Object implements Serializable {
	
	String name;		// 이름
	int studentId;		// 학번	
	
	// 기본생성자
	public JavaBean() {
		
	}
	
	// 모든 필드 초기화
	public JavaBean(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	// equals 구현
	@Override
	public boolean equals (Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof JavaBean)) {
			return false;
		}
		
		JavaBean j = (JavaBean) obj;
		if (this.studentId != j.studentId) {
			return false;
		}
		return true;
	}
	
	// hashCode 구현
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.studentId;
	}

	// toString 구현
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름은 ");
		sb.append(this.name);
		sb.append("이고, 학번은 ");
		sb.append(this.studentId);
		sb.append("입니다.");
		String a = sb.toString();
		return a;
	}
	
}
