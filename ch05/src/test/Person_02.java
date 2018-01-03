package test;

public class Person_02 {
	
	String name;
	
	public Person_02() {
		
	}
	
	public Person_02(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Person_02 p = new Person_02("예진");
		System.out.println(p.name);
		
		p = new Person_02();
		
		p.name = "진태";
		System.out.println(p.name);

	}

}
