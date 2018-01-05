package inheritance.overriding;

public class Person {
	
	public String name;
	public long number;
	
	public Person(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	// @Override는 오버라이딩 된게 아니니까 오류가 뜰수밖에
	public void printInfo() {
		System.out.println("이름: " + name + " 주민번호: " + number);
	}

}
