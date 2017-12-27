package practice;

import java.util.Scanner;

public class test1 {
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("두 실수를 입력하세요 >> ");
			
			double a = input.nextDouble();
			double b = input.nextDouble();
			
			System.out.println(a+b);
			System.out.println((a+b)/2);
			
			/* 다른해설
			 * double sum = a+b;
			 * double avg = sum /2;
			 * System.out.printf("합: %.2f 평균: %.2f %n", sum, avg);
			 */
			
			input.close();
		}
}
