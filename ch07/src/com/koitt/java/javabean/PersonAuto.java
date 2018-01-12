package com.koitt.java.javabean;

public class PersonAuto {
	
	private String name;
	private int age;
	
	// 1. 기본 생성자
	public PersonAuto() {
		
	}

	// 2. 생성자 자동완성 (모든 필드 초기화) alt + shift + S (Generate Constructor using field)
	public PersonAuto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. getter setter 구현	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 4. equals, hashCode 자동완성 alt + shift + S (Generate hashCode and equals)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교
		if (this == obj)						
			return true;
		
		// 2. Argument에서 받은 객체가 null 이면 false 리턴
		if (obj == null)
			return false;
		
		// 3. 클래스의 위치를 비교 ->  클래스의 타입을 확인하기 위해~?
		if (getClass() != obj.getClass())
			return false;
		
		// 4. 필드에 접근하기 위해 다운캐스팅
		PersonAuto other = (PersonAuto) obj;
		
		// 5. age 주소값 비교
		if (age != other.age)
			return false;
		
		// 6. this의 name이 null값일때
		if (name == null) {
			// other의 name이 null이 아니면 다른 객체로 판단 
			if (other.name != null)
				return false;
		} 
		// 7. name값이 다르면 다른 객체로 판단하여 결과를 리턴
		else if (!name.equals(other.name))
			return false;
		
		// 8. 위 조건 모두 만족하지 않는다면 같은 객체로 판단
		return true;
	}
	
	// toString 자동완성 alt + shift + S (Generate toString)
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonAuto [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		PersonAuto p = new PersonAuto("홍길동", 30);
		System.out.println(p.getClass());
		
		// toString 사용
		System.out.println(p);
	}

	
	
	
 
}
