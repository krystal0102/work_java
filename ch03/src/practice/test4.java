package practice;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ��� ( C: ����, F: ȭ��) >> ");
		String unit = input.next();
		
		System.out.println("�µ��� �Է��ϼ��� >> ");
		double B = input.nextDouble();
		
		double result = 0.0;
		
		switch (unit) {
		case "F": 
		case"f":
		result = (5.0 / 9.0)*(B-32);
		System.out.printf("���� %.2f �Դϴ�.", result);
		break;
		
		case "C": 
		case "c":
		result = (5.0 / 9.0)*(B+32);
		System.out.printf("ȭ�� %.2f �Դϴ�.", result);
		break;
			
		}
		
		input.close();
	}

}
