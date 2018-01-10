package exercise;

public class Person {
	
	private String name;
	
	public Person (String name) {
		this.name = name;
	}
	
	public boolean equals(Person gildong) {
		if (this.name == gildong.name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));
		
	}

}
