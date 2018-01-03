package test;

public class Student_02 {
	
	private String dept;
	private int num;
	
	public String getDept() {
		return dept;
	}
	
	public void setDept (String dept) {
		this.dept = dept;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		 
		Student_02 a = new Student_02();
		
		a.setDept("정보통신학과");
		a.setNum(11);
		
		System.out.println("저는 "+a.getDept()+" "+ a.getNum() + "학번 입니다.");
		
		
		
		

	}

}
