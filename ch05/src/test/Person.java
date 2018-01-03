package test;

public class Person {
	
	String name;
	int age;
	
	// 기본생성자
	public Person() {
		
	}
	
	// name만 초기화
	public Person(String name) {
		this.name = name;
	}
	
	// age만 초기화
	public Person(int age) {
		this.age = age;
	}
	
	// name,age 초기화
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

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
	
	

}
