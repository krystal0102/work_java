package control.loop;

public class Continue {

	public static void main(String[] args) {
		int i = 1;
		for ( i = 1; i <= 10; i++ ) {
			
			if ( i % 3 == 0 ) { 
				continue; // 3의 배수는 for문의 반복몸체로 가지 않고 수행문으로 가 i를 증가 시키고 조건문으로.
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}

}
