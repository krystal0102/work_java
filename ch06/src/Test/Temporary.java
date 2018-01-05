package Test;

public class Temporary extends Employee {
	
	int workHours;
	int salaryT = 10000;
	
	public Temporary(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}

	public int getWorkHours() {
		return workHours;
	}

	/*public void setWorkHours(int workHours) {
		this.workHours = workHours*salaryT;
	}*/

	public void printInfo() {
		System.out.println("비정규직: " + getWorkHours());
	}
	
}
