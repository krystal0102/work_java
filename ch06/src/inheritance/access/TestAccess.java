package inheritance.access;

import java.util.Date;

import inheritance.access.Account;

public class TestAccess extends Account {
	
	public TestAccess(String name, int number) {
		super(name, number);
		Date a = this.open;
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		String name = account.name;
		// 접근 불가능(상속받지 않은 클래스를 이용해서 객체를 생성했기때문에)
		Date a = account.open;
		
		TestAccess t = new TestAccess("홍길동", 1000);
		
		// 접근 가능 (public은 어디서든 접근이 가능)
		String one = t.name;
		
		// 접근 가능(상속 받은 클래스를 이용해서 객체를 생성했기 때문에)
		Date b = t.open;
		
		// 접근 불가능 (같은 패키지가 아니므로)
		int c = t.number;
		
		// 접근 불가능 (클래스 내부에서만 사용 가능하므로)
		// long d = t.balance();

		
	}
}
