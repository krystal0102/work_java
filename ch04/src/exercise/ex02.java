package exercise;

/* Math.abs() : 절대값이 리턴
 * 
 */
 
public class ex02 {

	public static void main(String[] args) {
		
		// i는 행의 수
		for ( int i = 0; i <= 7; i++ ) {
			
			for ( int j = 7; j >= -7; j-- ) {
				
				if (Math.abs(j) > i ) {
					System.out.print(' ');
				}
				
				else {
					System.out.printf("%d", Math.abs(j));
				}
			}
			System.out.println();
		}

	}

}
