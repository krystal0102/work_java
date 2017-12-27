package array.basic;

public class ArrayInit2 {

	public static void main(String[] args) {
		
		int score[];
		//보통 배열인지 구분을 쉽게 하기 위해 int[] score; 라고 표기함
		
		score = new int[] {2, 4, 7}; // 배열 선언 이후 초기화 방법
		/*score[0] = 2;
		 * score[1] = 4;
		 * score[2] = 7; 과 같음
		 */
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
		
		score = new int[] {23, 46, 78}; // 다른 배열을 생성하여 대입
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
		

	}

}
