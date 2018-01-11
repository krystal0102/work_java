package exercise;

import java.util.HashMap;
import java.util.Map;

public class MyData<K, V1, V2> {

	// Map 2개 활용
	Map<K, V1> telecom;		// key: 이름 value: 통신사
	Map<K, V2> book;		// key: 이름 value: 전화번호
	
	public MyData() {
		this.telecom = new HashMap<K, V1>();
		this.book = new HashMap<K, V2>();
	}
	
	public void search(String name) {
		V1 t = telecom.get(name);	// get에서 ctrl+1 누르고 assign어쩌구 누르면 자동으로 변수값 저장됨
		V2 b = book.get(name);
		
		System.out.println("입력하신 " + name + " 전화번호는 " + b + ", "
							+ "이동통신사는 " + t + "입니다.");
	}
	
	public void put(K name, V1 telecom, V2 phone) {
		this.telecom.put(name, telecom);
		this.book.put(name, phone);
	}
	
	
}
