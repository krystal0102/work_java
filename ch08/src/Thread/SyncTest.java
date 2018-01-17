package Thread;

import java.util.Random;

class BankAccount {
	int balance = 0;		// 은행 잔고

	// 인출
	public void withdraw(int money) {
		// 현재 출금하려는 금액보다 잔고가 많은지 검사
		if (money >= 0 && this.balance >= money) {
			try {
				Thread.sleep(100);
			}

			catch(InterruptedException e) {
				System.err.println(e);
			}

			this.balance -= money;
			System.out.printf("%s가 %d 인출하여 현재잔고 %d입니다. %n", 
								Thread.currentThread().getName(), money, this.balance);
		}
		else if (balance < money) {
			System.out.println("잔고가 부족하여 인출할 수 없습니다.");
		}
	}

	// 입금
	public void deposit (int money) {
		if (money > 0) {
			balance += money;
			System.out.printf("%s가 %d 입급하여 현재잔고 %d입니다. %n", 
								Thread.currentThread().getName(), money, this.balance);
		}
	}


}

public class SyncTest implements Runnable {

	BankAccount act = new BankAccount();
	
	// 여기서부터
	@Override
	public void run() {
		while(true) {
			int amount = new Random().nextInt(10000); // 0 ~ 10000까지 랜덤한 숫자 
			amount = amount%10 * 1000; // 10으로 나눈 나머지이기 때문에 1의 자리값에 1000을 곱한 값
			System.out.printf("[%s] 금액=%d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);	// 입금
			act.withdraw(amount*2);	// 출금 (2배로 한 이유 : 잔고를 바닥나게 하기 위해서)
			if (act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료");
				return;
			}

		}

	}
	// 여기까지가 Critical Section(임계영역) 

	public static void main(String[] args) {
		Runnable r = new SyncTest();
		Thread th1 =  new Thread(r);
		Thread th2 =  new Thread(r);
		
		th1.setName("철수");
		th2.setName("영희");
		
		th1.start();
		th2.start();
	}

}
