package exercise;

public class ex05 {

	public static void main(String[] args) {
		
		int year;

		int won = 1000000;
			
		for ( year = 1; year < 11; year++ ) {
			
			double a = (int)won*4.5*year;
			
			double total = (int)won + (int)a;
			
			System.out.printf("%d년차 수령액은 %f원 입니다.\n", year, total);
			
		
		}
		
	}

}
