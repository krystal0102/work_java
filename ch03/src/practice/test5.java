package practice;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	    System.out.println("연도를 입력하세요 >> ");
		int year = input.nextInt();
	    
		/* 문제 조건에 따라 입력받은 연도를 4로 나눈 나머지값이 0으로 떨어지는것을 표현 -> year%4 == 0
		 * 100으로 나누어 떨어지는것은 평년으로 한다 했으므로 반대값은 윤년 -> != 
		 */
		
		boolean a = year%4 == 0;
		boolean b = year%100 != 0;
		boolean c = year%400 == 0;
		
		// 윤년은 4 어쩌구, 400어쩌구를 논리합으로 충족하되, 100어쩌구의 반대값과 4어쩌구를 논리곱으로 충족하므로 아래와 같이 표현
	    if (a && b || c) {
	    	 System.out.println("윤년");
	    }
	    else {
	    	System.out.println("평년");
	    }
	    
	    input.close();

	}

}
