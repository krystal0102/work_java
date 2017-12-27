package practice;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >> ");
		
		int money = input.nextInt();
		
		/*int five = money/50000;
		System.out.println(five);
		
		money = money - five * 50000;
		
		int man = money/10000;
		System.out.println(man);
		
		money = money - man * 10000;
		
		int fchun = money/5000;
		System.out.println(fchun);
		
		money = money - fchun * 5000;
		
		int chun = money/1000;
		System.out.println(chun);*/
		
		int five = money / 50000;
		int man = money%50000 / 10000;
		int fchun = money%10000 / 5000;
		int chun = money%5000 / 1000;
		
		System.out.printf("50,000원권 %d개, 10,000원권 %d개, 5,000원권 %d개, 1,000원권 %d개입니다.", five, man, fchun, chun);
		
		
		
		
		input.close();
	}

}
