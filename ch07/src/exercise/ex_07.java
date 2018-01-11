package exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_07 {
	public static void main(String[] args) {
		System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");
		
		Scanner input = new Scanner(System.in);
		Set<String> set01 = new HashSet<String>();	// 중복되지 않은 문자열을 저장 : 모든 문자열이 다들어감
		Set<String> set02 = new HashSet<String>();	// 중복된 문자열을 저장 : 중복된 문자열만 들어감
		
		while (true) {
			String text = input.next();
			if (text.equals("quit")) {
				break;
			}
			
			boolean 이거중복이니 = !set01.add(text); // 이거중복이니 는 set01이 아닌 text
			if (이거중복이니) {
				set02.add(text);	
			}
		}		
		set01.removeAll(set02); // 중복되지 않은 문자열만 뽑아냄
		System.out.println("중복되지 않은 문자열 -> " + set01.toString());
		System.out.println("중복된 문자열 -> " + set02); // toString은 생략이 가능하니까
	}

}
