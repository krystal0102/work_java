package inheritance.typecast;

public class Instanceof {
	
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056432);
		if (she instanceof Staff) {			// A instanceof B :  A가 B의 객체이냐를 true false로 반환
			Staff st1 = (Staff) she;
		} 
		else {
			System.out.println("she는 Staff의 객체가 아닙니다.");
		}
		
		Person p = new Staff ("김상기", 1187543, "강서대학교", 3456);
		if (p instanceof Staff) {
			System.out.println("p는 Staff 객체입니다.");
			Staff st2 = (Staff)p; // 다운캐스팅할 때 instanceof로 검사를 하고 사용할 것 
		}
		
	}

}
