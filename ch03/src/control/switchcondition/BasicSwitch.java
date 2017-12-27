package control.switchcondition;

import java.util.Scanner;

public class BasicSwitch {

	public static void main(String[] args) {

		double x, y;
		int op;
		Scanner input = new Scanner(System.in);
		System.out.print("두 실수 입력 : ");
		
		x = input.nextDouble(); y = input.nextDouble();
		System.out.print("번호선택 1(+), 2(-), 3(*), 4(/) : ");
		
		op = input.nextInt();
		
		switch (op) {
			//case, default는 switch문에서 쓰는 키워드. 
			case 1:
				System.out.printf("%.2f + %.2f = %.2f\n", x, y, x + y);
				break;
			// break 가 없으면 default까지 모두 실행됨. 하나의 결과를 출력하기 위해선 사용해줘야함	
			case 2:	
				System.out.printf("%.2f - %.2f = %.2f\n", x, y, x - y);
				break;
			case 3:
				System.out.printf("%.2f * %.2f = %.2f\n", x, y, x * y);
				break;
			case 4:
				System.out.printf("%.2f / %.2f = %.2f\n", x, y, x / y);
				break;
			
			default	:
				System.err.printf("연산자 번호를 잘못 입력하였습니다.\n");
				
		}
		

	}

}
