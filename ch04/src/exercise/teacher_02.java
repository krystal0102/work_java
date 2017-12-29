package exercise;

import java.util.Scanner;

public class teacher_02 {

	public static void main(String[] args) {
		
		// 표준입력 받기 
		Scanner input = new Scanner(System.in);
		System.out.print("별의 최대 갯수를 입력하세요 >> ");
		int a = input.nextInt();
		
		// 배열 선언 및 초기화
		char[][] star = new char[a][];
		/* a가 5면 new char[5][] 가 되고
		   star[0][]
		   star[1][] 
		   star[2][]
		   star[3][] 
		   star[4][] 가 만들어짐*/
		
		
		// 래기드 배열 만들기
		for ( int i = 0; i < star.length; i++ ) {
			star[i] = new char[i + 1];
			/*	star[0] = new char[1]	-> 행[0]의 열[0]
				star[1] = new char[2]	-> 행[1]의 열[0][1]
				star[2] = new char[3]	-> 행[2]의 열[0][1][2]
				star[3] = new char[4]	-> 행[3]의 열[0][1][2][3]
				star[4] = new char[5]	-> 행[4]의 열[0][1][2][3][4]
			*/			
		}
		
		for ( int i=0; i<star.length; i++) {
			for ( int j=0; j<star[i].length; j++ ) {
				star[i][j] = '*';
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

	}
}