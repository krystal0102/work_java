package control.ifcondition;

import java.util.Scanner;

public class Gradeifelse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int point = input.nextInt(); // 값을 입력받기 전에 아래 코드는 실행되지 않음.
		char grade;
		
		if (90 <= point) {
			grade = 'A';
		}
		else if (80 <= point) {
			grade = 'B';
		}
		else if (70 <= point) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("학점 : " + grade);

	}

}
