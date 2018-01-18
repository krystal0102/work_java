package excercise;

public class BankAccount {
	
	private int minBalance; // 최저잔금
	private int balance;	// 잔금
	
	public BankAccount(int minBalance) {
		this.minBalance = minBalance;
	}

	public void deposit (int money) {

		if (money > 0) {
			this.balance += money;
			System.out.printf("%d원 입급하여 현재잔고 %d입니다. %n", money, this.balance);
		}

	}

	public void withdraw(int money) throws InvalidWithdraw {

			// 입금 요청 금액이 음수이거나
			if (money < 0 ) {
				throw new InvalidWithdraw("E01 : 요청 금액이 음수입니다.");
				
			}
			// 최저 잔금 이하로 인출을 요청
			else if (this.balance - money < this.minBalance) {
				throw new InvalidWithdraw("E02: 최저 잔금 이하로 인출을 요청하였습니다.");
				
			}
			
			this.balance -= money;
			System.out.println(money + "원 인출하여 잔액이" + balance + "입니다.");
		
	}
}




