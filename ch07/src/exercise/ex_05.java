package exercise;

import java.util.Calendar;

public class ex_05 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; 
		int date = now.get(Calendar.DATE);
		int datename = now.get(Calendar.DAY_OF_WEEK);		// 요일 구하기
		
		int dayOf = now.get(Calendar.DAY_OF_WEEK_IN_MONTH);	// 달에서 요일의 횟수
		int weekOf = now.get(Calendar.WEEK_OF_MONTH);		// 이달의 n번째 주
		int dayOfYear = now.get(Calendar.DAY_OF_YEAR);		// 해의 날짜
		int weekOfYear = now.get(Calendar.WEEK_OF_YEAR);	// 해의 주 횟수
		
		String realName = "";
		
		switch(datename){
        case 1:
        	realName = "일요일";
            break ;
        case 2:
        	realName = "월요일";
            break ;
        case 3:
        	realName = "화요일";
            break ;
        case 4:
        	realName = "수요일";
            break ;
        case 5:
        	realName = "목요일";
            break ;
        case 6:
        	realName = "금요일";
            break ;
        case 7:
        	realName = "토요일";
            break ;
		}
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + realName + "입니다.");
		System.out.println("이 달의 " + dayOf + "번쨰 " + realName + "입니다.");
		System.out.println("이 달의 " + weekOf + "번째 주입니다.");
		System.out.println("이 해의 " + dayOfYear + "일입니다.");
		System.out.println("이 해의 " + weekOfYear + "번째 주입니다.");
	}
	

}
