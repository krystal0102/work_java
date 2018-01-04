package inheritance.access;

import java.util.Date;

/*접근 제한자 ( 접근 지정자 ) 
- private 같은 클래스 내부에서만 사용가능
-(default, package 방식) : 패키지 내부에서만 상속가능
- protected : default 접근 범위 + 상속 받은 클래스 내부까지 사용가능
- publics : 어디서든 접근이 가능*/

public class Account {

		public String name;
		protected Date open;
		/*package*/ int number;
		private long balance;

		public Account(){}

		protected Account(String name, int number) {
			this.name = name;
			this.number = number;
			this.open = new Date(); // 객체가 생성되는 시점이 자동으로 입력됨
		}	
		// 입금메소드
		public long deposit(long amount) {
			return balance += amount;
		}

		public long widthraw(long amount) {
			return balance -= amount;
		}

		public long checkBalance() {
			System.out.println(name + ": 계좌번호" + number + ", 잔액:" + balance);
			return balance;
		}
}



