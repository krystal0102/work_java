package programming.basic;

import java.util.Scanner;

public class PersonInfo {
	
	static int weight;
	static double height;
	
	public static void main(String[] args) {
		
		System.out.print("�����Կ� Ű�� �Է��ϼ��� : ");
		
		Scanner AAA = new Scanner(System.in);
		
		weight = AAA.nextInt();
		height = AAA.nextDouble();
		
		System.out.printf("������: %dkg, Ű: %.1fcm", weight, height);
		
		AAA.close();
	}

}
