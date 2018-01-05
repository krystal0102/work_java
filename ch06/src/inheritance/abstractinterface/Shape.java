package inheritance.abstractinterface;

// 추상클래스
public abstract class Shape {
	
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 일반 메소드
	public void drawCenter() {
		System.out.println("(x, y) = " + x + ", " + y);
	}
	
	// 추상 메소드
	public abstract void draw(); // 헤드만 있고 몸체(body)가 없음 -> 추상메소드의 특징
								 // 메소드 몸체가 없는 이유 : 상속받은 클래스에서 구현하라는 뜻
	
	public static void main(String[] args) {
		// Shape s = new Circle(3.1, 4.5, 3.0); // 객체화오류 : 추상메소드 떄문에 Shape 클래스를 객체화 할 수 없다
		Shape s = new Circle(3.1, 4.5, 3.0); // 업캐스팅	
		s.draw();
	}

}
