package inheritance.overloading;

public class MyMath {
	
	double x, y;
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double multiply() {
		return x * y;
	}
	
	public static double multiply(double a, double b) {	
		/*static은 프로그램 시작하자마자 처음 메모리에 올라가기때문에 클래스보다 먼저 실행되어, 스태틱이 실행되는 시점엔 클래스에 대한 정보가 없음. 
		클래스가 메모리에 올라갈땐 스태틱을 제외한 정보들이 올라감*/
		return a * b;				
		// return x*y;				오류발생 	: x,y에 대한 정보가 아직 메모리에 없는 시점이기 때문
		// return this.x*this.y;	오류발생
	}
	
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply());
		System.out.println(MyMath.multiply(3.4, 6.7)); // 정적메소드 호출
	}
	
	
	
	

}
