package exercise;

public class ex06 {

	public static void main(String[] args) {
		
		//섭씨	
		int c;
		//화씨
		double f;
		
		//섭씨 온도가 -60부터 140까지 20씩 증가
		
		for ( c = -60; c <= 140; c += 20 ) {

			f = (int)((9.0/5.0)*c+32);
			
				System.out.printf("섭씨온도 : %d, 화씨온도 : %d%n", c, (int)f);
		
		}		

	}

}
