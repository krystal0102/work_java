package exercise;

import java.util.Calendar;
import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		// 표준입력으로 원하는 년도의 달력을 출력
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 년도와 월을 입력하세요 >> ");
		int yearInput = input.nextInt();
		int monthInput = input.nextInt();
		now.set(yearInput, monthInput -1 , 1);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);

		// 월의 시작일
		Calendar start = Calendar.getInstance();
		// 마지막날
		Calendar end = Calendar.getInstance();
		
		
		start.set(year, month, 1); 	// 현재 월의 1일 설정
		end.set(year, month+1, 1); 	// 다음달의 1일을 설정 ex> 2월 1일
		end.add(Calendar.DATE, -1);	// 현재 월의 마지막날로 가기 위해 -1을 해줌. ex> -1 하면1월 31일

		System.out.printf("     %d년 %d월 달력 %n", year, month+1);
		System.out.println(" 일  월  화  수  목  금  토"); // 한글은 2byte 공백은 1byte 라서 첫 시작은 3칸을 차지하고있다
		
		// 1일 전까지는 공백으로 출력
		int startDay = start.get(Calendar.DAY_OF_WEEK);	// 이번주의 몇번째	날인지 가져오기. 
		int endDate = end.get(Calendar.DATE);
		
		for (int i = 1; i < startDay; i++) {
			System.out.printf("%3s", " ");
		}
		
		// 1부터 마지막날까지 달력에 출력하기
		int day = startDay; // 달력의 몇번째 칸인지
		for (int i = 1; i <= endDate; i++, day++) {
			System.out.printf("%3d", i);
			if (day % 7 ==  0) 
				System.out.println();
		}
		
	}

}
