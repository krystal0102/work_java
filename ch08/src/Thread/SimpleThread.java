package Thread;

class MyThread extends Thread {
	
	// 스레드 기능을 구현하기 위한 메소드 재정의
	@Override
	public void run() {
		// 기능 구현
		for (int i = 1; i < 10; i++) {
			System.out.println(this.getName() + ": " + i
								+ " / 실제스레드: " + Thread.currentThread().getName());
		}
	}
}

public class SimpleThread {
	public static void main(String[] args) {
		MyThread th = new MyThread();	// 스레드 생성
		th.start(); // 스레드 시작 메소드 호출
		//th.run();										// start를 사용했을땐 th, th2가 왔다갔다 하면서 실행되지만
														// run을 사용하면 각 thread가 순차적으로 실행됨. (th 실행되고 th2실행)
		
		MyThread th2 = new MyThread();
		th2.start();
		//th2.run();
	}
}



