package Test;

public class Employee {
	
	String name;
	int age;
	String address;
	String dept;
	int salary;
	
	int workHours;
	int salaryT = 10000;
	
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
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours*salaryT;
	}

	public void printInfo() {
		System.out.println(name+age+address+dept);
	}

}
