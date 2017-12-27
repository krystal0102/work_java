package programming.basic;

public class HelloSimplePrintf {

	public static void main(String[] args) {
		byte age = 27;
		int weight = 70;
		double height = 175.8;
		
		/* %d :10진수
		 * %f : float값
		 * %s : String값
		 * %c : char값
		 */
		System.out.printf("나이: %d, 몸무게: %d, 키: %f, ", age, weight, height);
		System.out.printf("%s: %c형", "혈액형", 'O');
		
		/* println과 비교해보자
		 * System.out.println("나이: " + age + ", 몸무게: " + weight + ", 키: " + height)
		 */

	}

}
