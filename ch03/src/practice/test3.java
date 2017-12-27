package practice;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("kg를 입력하세요 >> ");
		
		double kg = input.nextDouble();
		double lb = kg / 0.453592;
		
		System.out.printf("pound : %.3f", lb);
		
		input.close();

	}

}
