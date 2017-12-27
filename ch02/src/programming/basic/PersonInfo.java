package programming.basic;

import java.util.Scanner;

public class PersonInfo {
	
	static int weight;
	static double height;
	
	public static void main(String[] args) {
		
		System.out.print("몸무게와 키를 입력하세요 : ");
		
		Scanner AAA = new Scanner(System.in);
		
		weight = AAA.nextInt();
		height = AAA.nextDouble();
		
		System.out.printf("몸무게: %dkg, 키: %.1fcm", weight, height);
		
		AAA.close();
	}

}
