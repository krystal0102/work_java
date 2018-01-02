package programming.basic;

public class HelloOverloading {
	
	public static void main(String[] args) {
		
		/* �޼��� �����ε�(Method Overloading) : ȣ�������� ������ ��� �޼��� �������� �ߺ��ؼ� �� �� �ִ�.
		 * 1. Argument(parameter) �� ������ ��ġ�ϰ�
		 * 2. Argument Ÿ���� ��ġ�� ���
		 */
		
		int sum = plus(10,20);
		System.out.println(sum);
		
		double sum01 = plus(10.25,20.10);
		System.out.println(sum01);
	}

	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
}
