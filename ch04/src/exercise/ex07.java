package exercise;

public class ex07 {

	public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		
		while ( sum < 5000 ) {
			//초기값을 0으로 했기 떄문에 증가값을 먼저 입력
			n++;
			sum += n;
			
			System.out.printf("가장 큰 합 : %d, 그 때의 n : %d%n", sum, n);
			//출력해봤을때 결과값이 5000을 넘어가므로 
		}
		
		//최종결과를 출력할때 한단계 전으로 빼줌
		System.out.printf("가장 큰 합 : %d, 그 때의 n : %d", sum-n, --n);
		
		

	}

}
