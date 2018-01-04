package inheritance.access;

public class AccountTest {
	
	public static void main(String[] args) {
		
		SavingAccount myAccount = new SavingAccount("강민경", 1234567834, 0.32);
		
		myAccount.deposit(50000);
		myAccount.widthraw(4000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name); // 같은 클래스 내부여서 접근가능
		System.out.println(myAccount.open); // default + 클래스 상속을 받아 접근 가능
		System.out.println(myAccount.number); // 같은 패키지 내부라 접근가능
		// System.out.println(myAccount.balance); 접근불가
		
	}

}
