package inheritance.typecast;

public class Fruit {				// Public클래스는 파일 하나당 하나만 사용할 수 있음
	public static void main(String[] args) {
		Fruit f = new Fruit();			// 부모클래스의 객체를 만듬
		System.out.println(f instanceof Fruit);
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		Fruit fa = new Apple();
		System.out.println(fa instanceof Fruit); // 후르츠 상속 받으니까 T
		System.out.println(fa instanceof Apple); // 자기 자신이니까 T
		System.out.println(fa instanceof Pear);
		Apple a = new Apple();
		System.out.println(a instanceof Fruit); //  상속받은 부모니까 T
		System.out.println(a instanceof Apple); 
		// System.out.println(a instanceof Grape); // 서로 상속관계가 아니므로(평등한관계) 키워드를 사용할 수 없음
	}

}

class Apple extends Fruit{
	
}
class Pear extends Fruit{
	
}
class Grape extends Fruit{
	
}
