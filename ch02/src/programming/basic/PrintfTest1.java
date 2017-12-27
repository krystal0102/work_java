package programming.basic;

public class PrintfTest1 {

	public static void main(String[] args) {
		
		//6-1
		System.out.printf("%d %f %s", 10, 3.7854, "정수");
		
		//6-2
		int year = 2014;
		double amount = 1;
		System.out.format("%1$d %2$f %2$8.1d %1$d", year, amount);
		
		
	}
	
}	

