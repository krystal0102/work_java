package practice;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ��� >> ");
		
		int A = input.nextInt();
	    
		int man = A/10000;
		int chun = A%10000 / 1000;
		int baek = A%1000 / 100;
		int ten = A%100 / 10;
		int il = A%10;

		System.out.printf("%d�� %dõ %d�� %d�� %d���Դϴ�.", man, chun, baek, ten, il);
		
		input.close();	
	}

}
