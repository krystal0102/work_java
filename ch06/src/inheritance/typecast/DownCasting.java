package inheritance.typecast;

public class DownCasting {
	
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056462);
		System.out.println(she.name + " " + she.number); //  부모로태어남
		// Faculty f = she;					컴파일오류 : 실행하기 전에 알 수 있는 오류
		// Faculty f1 = (Faculty) she;		실행 오류 : Runtime Exception. 자식은 부모행세를 할 수 있지만 부모는 자식 행세를 할 수 없음
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456); // 업캐스팅 : Staff가 Person타입으로 객체 생성
		// Staff s = p;						컴파일 오류
		Staff s = (Staff) p;				// 다운 캐스팅. 자식(Staff)이 부모(Person)로 갔다가 다시 자식(Staff)으로 돌아옴
		s.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.print(s.division);
		
		Faculty f2 = s;			//업캐스팅
		Staff s1 = (Staff)f2;	//다운캐스팅
	}

}
