package wait;

import java.util.Random;

class BankAccount {
	int balance = 0;		// 은행 잔고
	// int diff = 0;


	public synchronized void withdraw(int money) {
		if (money < 0) {
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}

		int count = 0;
		while (this.balance < money) {
			System.out.printf("[%s] ", Thread.currentThread().getName());

			// 지속적으로 잔금이 부족하여 메소드 종료
			if (++count > 3) {
				System.out.println("잔액이 부족하여 출금처리못하고 종료합니다.");
				return;
			}

			System.out.printf("%16s", "wait(1000) 호출");
			System.out.printf("인출요구금액=%6d, balance=%6d %n", money, this.balance);

			try {
				// this.wait();
				this.wait(1000);	// 출금할 금액이 부족해 누군가 입금할 때까지 기다림
			}
			catch (InterruptedException e) {
				System.err.println(e);
			}
		}

		System.out.printf("[%s] ", Thread.currentThread().getName());
		this.balance -= money;
		System.out.printf(" %12s 정상인출금액=%6d, balance=%6d %n", "정상출금처리:", money, balance);
	}

	public synchronized void deposit(int money) {
		if (money < 0) {
			System.out.println("입금 금액이 잘못됐습니다.");
			return;
		}

		this.balance += money;
		System.out.printf("[%s] ", Thread.currentThread().getName());
		System.out.printf("%16s", "notify() 호출");
		System.out.printf("계좌입금금액=%6d, balance=%6d %n", money, this.balance);
		// notify();
		this.notifyAll();
	}

}

public class SyncTest implements Runnable {

	BankAccount act = new BankAccount();

	public void run() {
		for (int i = 1; i < 3; i++) { // 0.얼마얼마의 숫자가 랜덤으로 나옴 * 5 + 1 하면 정수부분이 5까지 나옴
			int amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.deposit(amount);
			
			amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.withdraw(amount);
		}

	}

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
