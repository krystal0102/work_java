package exercise;

public class ex08 {

	public static void main(String[] args) {

	int	rag[][] = {{78,48,78,98}, {99,92}, {29,64,83}, {34,78,92,56}};
	
			//이차원배열의 값을 출력
			for (int i=0, sum = 0; i<rag.length; i++) {
				
				for (int j=0; j<rag[i].length; j++) {
					
					//이차원배열의 값을 출력
					System.out.print(rag[i][j] + " ");
					
					//배열 값의 총 합을 출력
					sum += rag[i][j];
					
				}
				
			System.out.println();	
			
			// 각 행의 값, 합, 평균을 출력	
			System.out.printf("행의 합 : %d, 평균 : %d%n", sum, sum / rag[i].length);
			
			// 초기화 시켜주지 않으면 이전 sum값에 더해져서 결과를 출력하므로 0으로 초기화 시켜준다
			sum = 0;
							
		}

	}

}
