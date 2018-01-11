package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Map<String, String> book = new HashMap<String, String>();
		book.put("김미현", "010-1234-5678");
		book.put("현빈", "010-2222-3333");
		book.put("김우빈", "010-4444-5555");
		book.put("차은우", "010-6666-7777");
		book.put("박보검", "010-8888-9999");
		
		System.out.println("검색할 이름을 입력하세요 >> ");
		String name = input.next();
		
		String phone = book.get(name);
		System.out.println("입력하신 " + name + "의 전화번호는 " + phone + "입니다" );
		
	}

}
