package practice;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("세 수를 입력하세요 >> ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("가장 큰 수는 " + max + "이다.");
		
		input.close();
		
	}

}
