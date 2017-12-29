package exercise;

public class ex05 {

	public static void main(String[] args) {
		// 예치기간
		int year;
		// 원금
		double won = 1000000;
			
		for ( year = 1; year <= 10; year++ ) {			
			
			// 만기 시 총 수령액
			double total = won * (1 + 0.045 * year);
			
			System.out.printf("%d년차 수령액은 %.0f원 입니다.\n", year, total);
			
		
		}
		
	}

}
