package test;

public class SalaryMan {
	
	int salary = 1000000;
	
	int getAnnualGross() {
	 return ((12*salary)+(salary*5));
	}
	
	public SalaryMan() {
		
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross()); // 기본생성자를 이용하여 초기값을 출력
		System.out.println(new SalaryMan(2000000).getAnnualGross()); 
	}
	
}
