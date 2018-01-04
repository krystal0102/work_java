package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {
	
	public static void main(String[] args) {
		
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		
		myAccount.deposit(400000);
		myAccount.widthraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);			// 접근가능
		// System.out.println(myAccount.open); 		// 접근불가
		// System.out.println(myAccount.number); 	// 접근불가
		// System.out.println(myAccount.balance);	// 접근불가
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
		cAccount.deposit(250000);
		cAccount.widthraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name); 			// 접근 가능. public
		System.out.println(cAccount.minimum);		// 접근 가능. default이며 같은 패키지 내부 
		// System.out.println(cAccount.open); 		// 접근 불가. CheckAccount내부가 아니라서 
		// System.out.println(cAccount.number); 	// 접근 불가. Account와 CheckTest가 같은 패키지 내부가 아니라서
		// System.out.println(cAccount.balance);	// 접근불가
		
	}

}
