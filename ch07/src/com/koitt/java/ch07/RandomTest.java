package com.koitt.java.ch07;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rd = new Random();
		// Random rd = new Random(45);
		
		for (int i=0; i<6; i++) {
			System.out.print(rd.nextInt() + " ");
		}	
		System.out.println();
		
		for (int i=0; i<6; i++) { //원래는 0~44사이 근데 +1을 붙였으니까 1부터 45?
			System.out.print((rd.nextInt(44)+1) + " "); // 만약 +1이 없다면 0부터 출력됐을것
		}	
		System.out.println();
		
		for (int i=0; i<6; i++) { //0 ~ 1 사이의 더블형 숫자들을 랜덤으로 출력
			System.out.printf("%.2f ", rd.nextDouble());  
		}	
		System.out.println();
	}

}
