package test;

public class AccountTest {

	public static void main(String[] args) {
		
		Account aaa = new Account("홍길동", 1000000);
			System.out.println("현재 잔액: " + aaa.withdraw(1100000));	

	}

}
