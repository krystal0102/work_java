package practice;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 >> ");
		
		int A = input.nextInt();
	    
		int man = A/10000;
		int chun = A%10000 / 1000;
		int baek = A%1000 / 100;
		int ten = A%100 / 10;
		int il = A%10;

		System.out.printf("%d만 %d천 %d백 %d십 %d원입니다.", man, chun, baek, ten, il);
		
		input.close();	
	}

}
