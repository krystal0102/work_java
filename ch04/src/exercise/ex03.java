package exercise;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		String a = input.next();
		
		/*//a.length() 는 글자의 수를 리턴
		for ( int i = a.length() -1; i >= 0; i-- ) {
			char result = a.charAt(i);
			System.out.print(result);
		}*/
		int i = a.length() -1;
		
		do {
			char result = a.charAt(i);
			System.out.print(result);
			i--;	
		}while ( i >= 0 );
			
		input.close();

	}

}
