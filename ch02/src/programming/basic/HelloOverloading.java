package programming.basic;

public class HelloOverloading {
	
	public static void main(String[] args) {
		
		/* 메서드 오버로딩(Method Overloading) : 호출조건을 충족할 경우 메서드 변수명을 중복해서 쓸 수 있다.
		 * 1. Argument(parameter) 의 개수가 일치하고
		 * 2. Argument 타입이 일치할 경우
		 */
		
		int sum = plus(10,20);
		System.out.println(sum);
		
		double sum01 = plusDouble(10.25,20.10);
		System.out.println(sum01);
	}

	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static double plusDouble(double a, double b) {
		double result = a + b;
		return result;
	}
}
