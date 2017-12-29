package exercise;

public class ex09 {

	public static void main(String[] args) {
		
		int[] prime = new int[1001]; // 0 ~ 1000까지 만들기 위해서
		
		// for문을 돌며 0으로 초기화
		for ( int i = 0; i < prime.length; i++ ) {
			prime[i] = 0;
		}
		
		//primep[2]부터 prime[1000]까지 1을 대입
		for ( int i = 2; i < prime.length; i++) {
			prime[i] = 1;
		}
		
		//에라토스테네스의 체 알고리즘 적용 ( 반복을 최대값의 제곱근까지만 함 )
		int limit = (int) Math.sqrt(1000); // Math.sqrt()메서드는 제곱근
		// i가 i의 배수가 된다
		for ( int i = 2; i <= limit; i++ ) {
			
			if ( prime[i] == 1 ) {
				
				for ( int j = 2 * i; j <= 1000; j++ ) {
					
					// 소수가 아닌것을 0으로 출력하는 if문
					if ( j % i == 0 ) {
						prime[j] = 0;
					}
					
				}
			}
		}
		
		int count = 0;
		for ( int i = 2; i <= 1000; i++ ) {
			if ( prime[i] == 1 ) {
				System.out.printf("%4d ", i);
				count++;
			}
			
			if ( count == 20 ) {
				System.out.println();
				count = 0;
			}
		}

	}

}
