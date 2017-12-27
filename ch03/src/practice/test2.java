package practice;

import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 실수를 입력하세요 >> ");
		
		//명시적 형변환
		int a = (int)input.nextDouble();
		int b = (int)input.nextDouble();
		
		/* 묵시적 형변환
		 * a와 b의 합은 int형이고 double sum변수에 집어넣을때 자동으로 double형으로 변경됨
		 * double sum과 int형을 2로 나눴기 때문에 결과는  double형이고 마찬가지로 
		 * double avg변수에 넣었기 때문에 자동으로 double형으로 변경
		 */
		double sum = a+b;
		double avg = sum /2;
		
		System.out.printf("합: %.2f 평균: %.2f %n", sum, avg);
		
		input.close();
		
		
	}

}
