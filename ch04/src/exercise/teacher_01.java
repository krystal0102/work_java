package exercise;

public class teacher_01 {

	public static void main(String[] args) {

		int i;
		int j;
		// 2단부터 9단까지 반복
		for ( i = 2; i <= 9; i++ ) {
			
			// 곱하는 숫자 1~9 반복. ex>여기서 곱하는 숫자 2는 고정되어있음
			for ( j = 1; j <= 9; j++ ) {
				//System.out.print(i + "*" + j + "=" + i*j + " " ); 여기서 마지막 공백란에 \t(탭키)를 사용하면 탭만큼 공백
				System.out.printf("%d*%d=%d \t", i,j,i*j);
			}
		System.out.println();
		System.out.println();
		}
		
	}

}
