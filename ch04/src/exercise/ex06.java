package exercise;

public class ex06 {

	public static void main(String[] args) {

		int c;
		int f = 0;
	
		for ( c = -60; c < 141; c += 20 ) {
					
			f++;
			if ( f < 284 ) {
			f = (int)((9.0/5.0)*c+32);
				System.out.println(f);
			}
			
		}		

	}

}
