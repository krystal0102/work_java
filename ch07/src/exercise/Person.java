package exercise;

public class Person {
	
	private String name;
	
	public Person (String name) {
		this.name = name;
	}
	

	@Override
	public boolean equals (Object obj) {
		// 1. Argument 의 객체와 나 자신의 주소값을 비교
		if (this == obj) {
			return true;
		}
		// 2. Argument의 객체가 이 클래스를 상속받고 있는지 검사
		if (!(obj instanceof Person)) {
			return false;	// Person이 아닐경우 이름 같은지 비교할 필요 없이 바로 false
		}
		
		// 3. 실제 name필드 값이 같은지 비교
		Person p = (Person) obj;	// obj가 name필드에 접근하기위해 다운캐스팅
		
		if (this.name.equals(p.name)) {	//실제 name필드값끼리 비교
			return true;
		}
		
		return false;	// Boolean이므로 기본값이 false라서 기본 리턴값은 false로 한다
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));
		
	}

}
