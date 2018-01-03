package test;

public class Student {
	
	String dept;
	int num;
	
	public Student(String dept, int num) {
		this.dept = dept;
		this.num = num;
	}
	
	public void print() {
		System.out.println("저는 " + this.dept + "과 " + this.num + "학번입니다.");
	}
	
	public static void main(String[] args) {
		
		Student a = new Student("정보통신학",11);
		a.print();
		
	}

}
