package practice;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� ������� �Է��ϼ��� >> ");
		
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		if (weight <= (height-100)*0.9) {
			System.out.println("�����Դϴ�.");
			}
		else {
			System.out.println("���Դϴ�.");
		}
		
		input.close();
	}
}
