package control.loop;

public class For {

	public static void main(String[] args) {
		int i = 1;
		// 0초기값 1조건검사 2반복몸체(i + "") 3수행문 .순서로 1,2,3,반복
		for ( i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		//변수 2개를 초기화한 경우
		int sum = 0;
		for ( i = 1, sum = 0; i <= 10; sum += i, i++ );
		//반복몸체가 없음 {}가 생략되어있음. 초기화 하고 조건문 실행후 
		
		System.out.printf("합 : %d%n", sum);
		
		for ( int j = 1, total = 0; j <= 5; j++) {
			total += j;
			System.out.printf("1에서 %d까지 합은 %d입니다. %n",j,total );
		}

	}

}
