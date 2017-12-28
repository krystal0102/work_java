package exercise;

public class ex01 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
		//int count = 0;
		
		for (i=1; i <= 100; i++ ) {
			
			/* 다른 풀이
			 * 
			 * if ( (i % 2 != 0) && (i % 3 != 0) && (i % 25 != 0) && (i % 7 != 0) ) {
			 * 	System.out.print( i + " " );
			 * 	count++;
			 * 
			 * if (count == 10 ) {
			 * 	System.out.println();
			 * 	count = 0;
			 * }
			 */
			
			if(i%2 == 0)
				continue;
			
			if(i%3 == 0)
				continue;
			
			if(i%5 == 0)
				continue;
			
			if(i%7 == 0)
				continue;
			
			System.out.print(i + " ");
			j++;
			if ( j%10 == 0 ) {
			System.out.println();	
			}
			
		}
		
		
		
		
	}

}
