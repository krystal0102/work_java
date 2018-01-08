package Check_06;

public class Professor extends Person{
	
	String dept;
	
	public Professor (String dept, String name) {
		super(name);
		this.dept = dept;
	}

	Professor pf = new Professor("전산학과", "홍성룡");
}
