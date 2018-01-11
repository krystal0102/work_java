package exercise;

import java.util.Calendar;
import java.util.Scanner;

public class ex_04 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		Scanner when = new Scanner(System.in);
		System.out.print("년, 월, 일을 입력하세요 >> ");
		
		// 표준입력으로 날짜를 입력받음
		int year = when.nextInt();
		int month = when.nextInt();
		int date = when.nextInt();
		
		// 입력받은 날짜를 cal에 세팅하기
		cal.set(year, month-1, date);
		
		/*cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, date);
		cal.set(Calendar.MONTH, month-1);*/
		
		// 요일을 숫자로 리턴 : 1부터 일요일
		int datename = cal.get(Calendar.DAY_OF_WEEK);	
		
		switch(datename){
        case Calendar.SUNDAY :	//일요일이 1이라는것을 자바에서 이미 제공하고 있음
        	System.out.print("일요일");
            break ;
        case Calendar.MONDAY:
        	System.out.print("월요일");
            break ;
        case Calendar.TUESDAY:
        	System.out.print("화요일");
            break ;
        case Calendar.WEDNESDAY:
        	System.out.print("수요일");
            break ;
        case Calendar.THURSDAY:
        	System.out.print("목요일");
            break ;
        case Calendar.FRIDAY:
        	System.out.print("금요일");
            break ;
        case Calendar.SATURDAY:
        	System.out.print("토요일");
            break ;
		}

		
    }

}