package programming.basic;

import java.util.Scanner; //스캐너라는 클래스를 메인 메서드 안의 클래스에서 사용하겠다 ctrl+shift+O:자동으로 import추가

public class HelloOuput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //따라서 여기서는 java.util을 일일히 기입하지 않아도 된다
		
		System.out.println("십진수와 이진수를 각각 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt(2);
		System.out.println("num1 = " + num1 + ", num2 = " + num2 );
		System.out.printf("num1 = %d, num2 = %d", num1, num2);
		

	}

}
