package inheritance.abstractinterface;

public class Abstract {
	public static void main(String[] args) {
		Shape r = new Rectangle(2, 3, 3.67, 7.89); // 상위클래스 타입으로 선언해서 객체를 만들어서
		Shape c = new Circle(3, 4, 4.82);
		r.draw();
		c.draw();
		
		Shape sa[] = {new Rectangle(2.5, 3.1, 1.67, 3.89), new Circle(4.2, 3.8, 1.56)}; // 여기와 같이 랙탱글과 써클을 모두 활용
		sa[0].draw();
		sa[1].draw();
		
	}

}
