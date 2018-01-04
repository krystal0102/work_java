package inheritance.typecast;

public class UpCasting {
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056432); // 부모 클래스 이용해서 she만들었음
		System.out.println(she.name + " " + she.number);
		
		
		Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
		Person p = f;		// 부모의 타입을 선언한 변수에 자식의 객체를 넣을 수 있다. 업캐스팅
		System.out.print(p.name + " " + p.number+ " ");
		// System.out.print(p.univ); Person 클래스에서 univ필드를 찾을 수 없으므로
		System.out.println(f.name + " " + ((Person) f).number); // Faculty f
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s;		// 업캐스팅
		Faculty ft = s;		// 업캐스팅
		System.out.print(pn.name + " " + pn.number+ " ");
		System.out.print(ft.univ + " " + ft.number);
		System.out.println(s.division);
		
	}

}
