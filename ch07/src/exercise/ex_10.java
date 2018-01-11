package exercise;

import java.util.Scanner;

public class ex_10 {
	public static void main(String[] args) {
		MyData<String, String, String> mydata = new MyData<>(); 
		mydata.put("김이용", "KT", "010-3916-3985");
		mydata.put("홍길동", "SK", "010-3333-3333");
		
		System.out.println("검색할 이름을 적으세요 >> ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		mydata.search(name);
		
		input.close();
	}

}
