package practice;

import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� �Ǽ��� �Է��ϼ��� >> ");
		
		//����� ����ȯ
		int a = (int)input.nextDouble();
		int b = (int)input.nextDouble();
		
		/* ������ ����ȯ
		 * a�� b�� ���� int���̰� double sum������ ��������� �ڵ����� double������ �����
		 * double sum�� int���� 2�� ������ ������ �����  double���̰� ���������� 
		 * double avg������ �־��� ������ �ڵ����� double������ ����
		 */
		double sum = a+b;
		double avg = sum /2;
		
		System.out.printf("��: %.2f ���: %.2f %n", sum, avg);
		
		input.close();
		
		
	}

}
