package exercise;

//1~9단까지 단을 아래로 출력해보자
public class teacher_03 {

	public static void main(String[] args) {
	
		int i;
		int j;
		
		//곱하는 수가 고정됨
		for ( i = 1; i <= 9; i++ ) {
			
			//단수
			for ( j = 2; j <= 9; j++ ) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t" );
			}
		System.out.println();
		}

	}
}	
