package control.loop;

public class Dowhile {

	public static void main(String[] args) {
		int i = 1;
		
		do { // 조건없이 먼저 수행하고 while문을 검사
			System.out.print(i++ + " ");
		}
		while ( i <= 10 );	
		
		System.out.println();
		
	
	}

}
