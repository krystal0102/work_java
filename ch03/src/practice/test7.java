package practice;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("달을 입력하세요 >> ");
		int month = input.nextInt();
		
		//if조건문을 사용했을때
		/*if (month > 0 && month <= 6) {
			System.out.println(month + "월은 상반기입니다.");
		}
		else if (month >= 7 && month <=12 ) {
			System.out.println(month + "월은 하반기입니다.");
		}
		*/
		
		String a = (month > 6) ? "하반기입니다." : "상반기입니다." ;
		System.out.println(a);
		
		input.close();

	}

}
