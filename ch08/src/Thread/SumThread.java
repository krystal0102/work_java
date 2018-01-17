package Thread;

public class SumThread implements Runnable {
	
	private int end;
	
	public SumThread (int end) {
		this.end = end;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= this.end; i++) {
			sum += i;
			System.out.print("현재 스레드 수: " + Thread.activeCount());
			System.out.print(", " + Thread.currentThread().getName());	// 현재 쓰고있는 스레드 이름을 알고 싶을때~
			System.out.printf(": sum(1:%d) = %d %n", i, sum);
		}
	}
	
	public static void main(String[] args) {
		// main스레드가 main() 메소드를 호출하므로 이 부분에도 스레드가 이미 실행
		System.out.print("main 스레드 ID: ");
		System.out.print(Thread.currentThread().getId());
		System.out.print(", 현재 스레드 수: ");
		System.out.print(Thread.activeCount());
		System.out.print(", 현재 스레드 이름: ");
		System.out.println(Thread.currentThread().getName());
		
		// 직접 구현한 스레드를 실행
		Runnable r1 = new SumThread(5);	// 인터페이스 Runnable을 상속받지만 Runnable엔 스레드기능 x
										// 그래서 아래에서 스레드에 넣어준다
		Thread th1 = new Thread(r1);
		th1.start();
	
	}
	
	

}
