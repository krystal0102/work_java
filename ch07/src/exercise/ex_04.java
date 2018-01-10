package exercise;

import java.util.Calendar;
import java.util.Scanner;

public class ex_04 {
	
	public static void main(String[] args) {
		
		String realName;
		
		
		Scanner when = new Scanner(System.in);
		System.out.print("년, 월, 일을 입력하세요 >> ");
		int year = when.nextInt();
		int month = when.nextInt();
		int date = when.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, date);
		cal.set(Calendar.MONTH, month-1);
		
		int datename = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(datename){
        case 1:
        	realName = "일";
        	System.out.print(realName);
            break ;
        case 2:
        	realName = "월";
        	System.out.print(realName);
            break ;
        case 3:
        	realName = "화";
        	System.out.print(realName);
            break ;
        case 4:
        	realName = "수";
        	System.out.print(realName);
            break ;
        case 5:
        	realName = "목";
        	System.out.print(realName);
            break ;
        case 6:
        	realName = "금";
        	System.out.print(realName);
            break ;
        case 7:
        	realName = "토";
        	System.out.print(realName);
            break ;
		}

		
    }

}