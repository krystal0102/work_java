package Test;

public class Temporary extends Employee {
	
	private int workHours;
	private int salaryT = 10000;
	
	public Temporary(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}

	public int getWorkHours() {
		return workHours;
	}
	
	@Override
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
		super.setSalary(this.workHours*this.salaryT);
	}

	public void printInfo() {
		System.out.println("비정규직: " + this.workHours + " / " + super.getSalary());
	}
	
	public static void main(String[] args) {
		
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
		
	}
	
}
