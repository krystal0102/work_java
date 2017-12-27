package programming.basic;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner dit = new Scanner(System.in);
		int a = dit.nextInt();
		System.out.printf("%o%n", a );
		System.out.printf("%d%n", a );
		System.out.printf("%x%n", a );
		
		dit.close();
		
	}

}
