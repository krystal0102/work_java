package Test;

public class Employee {
	
	private String name;
	private int age;
	private String address;
	private String dept;
	private int salary;
	
	public Employee() {
		
	}

	public Employee(String name, int age, String address, String dept) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setWorkHours(int workHours) {}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("부서: " + dept);
	}

}
