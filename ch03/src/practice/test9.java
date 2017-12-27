package practice;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("키와 몸무게를 순서대로 입력하세요 >> ");
		
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		if (weight <= (height-100)*0.9) {
			System.out.println("정상입니다.");
			}
		else {
			System.out.println("비만입니다.");
		}
		
		input.close();
	}
}
