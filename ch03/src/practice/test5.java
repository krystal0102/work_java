package practice;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	    System.out.println("������ �Է��ϼ��� >> ");
		int year = input.nextInt();
	    
		/* ���� ���ǿ� ���� �Է¹��� ������ 4�� ���� ���������� 0���� �������°��� ǥ�� -> year%4 == 0
		 * 100���� ������ �������°��� ������� �Ѵ� �����Ƿ� �ݴ밪�� ���� -> != 
		 */
		
		boolean a = year%4 == 0;
		boolean b = year%100 != 0;
		boolean c = year%400 == 0;
		
		// ������ 4 ��¼��, 400��¼���� �������� �����ϵ�, 100��¼���� �ݴ밪�� 4��¼���� �������� �����ϹǷ� �Ʒ��� ���� ǥ��
	    if (a && b || c) {
	    	 System.out.println("����");
	    }
	    else {
	    	System.out.println("���");
	    }
	    
	    input.close();

	}

}
