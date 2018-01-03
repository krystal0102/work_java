package obj.basic;

public class Circle {

	public double radius;
	public static double PI = 3.141592;
	// static 은 프로그램 시작하자마자 종료할 때 까지 사용되므로 계속 사용할 경우에만 쓰도록 해야함.
	// 남용하게 되면 메모리 공간을 과도하게 차지해 영역을 침범하는 오버플로우 발생
	
	// 생성자 구현
	public Circle(double radius) {
		this.radius = radius; 
	}
	
	// 현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return this.radius*this.radius*PI;
	}
	
	// 주요 정보 출력
	public void print() {
		System.out.printf("반지름이 %f인 원의 면적은 %f이다. %n", radius, getArea());	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("원주율: " + Circle.PI); // static 을 붙였기 때문에 객체를 만들지 않아도 바로 사용 가능
		
		Circle c1 = new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
		
		c1.PI = 3.14159265; // 객체에다가 점찍고 쓰는게 아니라 킁래스명.PI 로 접근해라
		System.out.println("원주율: " + c2.PI);
		

	}

}
