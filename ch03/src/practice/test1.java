package practice;

import java.util.Scanner;

public class test1 {
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("�� �Ǽ��� �Է��ϼ��� >> ");
			
			double a = input.nextDouble();
			double b = input.nextDouble();
			
			System.out.println(a+b);
			System.out.println((a+b)/2);
			
			/* �ٸ��ؼ�
			 * double sum = a+b;
			 * double avg = sum /2;
			 * System.out.printf("��: %.2f ���: %.2f %n", sum, avg);
			 */
			
			input.close();
		}
}
