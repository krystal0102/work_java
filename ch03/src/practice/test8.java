package practice;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ��� >> ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("���� ū ���� " + max + "�̴�.");
		
		input.close();
		
	}

}
