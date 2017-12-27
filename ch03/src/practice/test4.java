package practice;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요 ( C: 섭씨, F: 화씨) >> ");
		String unit = input.next();
		
		System.out.println("온도를 입력하세요 >> ");
		double B = input.nextDouble();
		
		double result = 0.0;
		
		switch (unit) {
		case "F": 
		case"f":
		result = (5.0 / 9.0)*(B-32);
		System.out.printf("섭씨 %.2f 입니다.", result);
		break;
		
		case "C": 
		case "c":
		result = (5.0 / 9.0)*(B+32);
		System.out.printf("화씨 %.2f 입니다.", result);
		break;
			
		}
		
		input.close();
	}

}
