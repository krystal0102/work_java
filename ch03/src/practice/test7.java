package practice;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� >> ");
		int month = input.nextInt();
		
		//if���ǹ��� ���������
		/*if (month > 0 && month <= 6) {
			System.out.println(month + "���� ��ݱ��Դϴ�.");
		}
		else if (month >= 7 && month <=12 ) {
			System.out.println(month + "���� �Ϲݱ��Դϴ�.");
		}
		*/
		
		String a = (month > 6) ? "�Ϲݱ��Դϴ�." : "��ݱ��Դϴ�." ;
		System.out.println(a);
		
		input.close();

	}

}
