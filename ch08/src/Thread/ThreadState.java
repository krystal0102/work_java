package Thread;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(40);			// 40 밀리초 동안 잠깐 멈춤
				// 현재 실행되고 있는 스레드의 상태를 출력
				System.out.print(Thread.currentThread().getState() + ", ");	
				// 현재 실행되고 있는 스레드의 이름을 출력
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
			catch (InterruptedException e) {
				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다.");
				return;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("스레드의 모든 상태: 6가지");
		
		// Thread.State enum에 정의된 값들을 하나씩 출력
		for (Thread.State c : Thread.State.values()) {
			System.out.print(c + " ");
		}
		System.out.println('\n');

							// Runnable을 상속받은 클래스 객체를 만듬
		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선 순위: " + th.getPriority()); // 결과는 5. NORM_PRIORITY 가 5로 설정되어 있기 때문

		// 우선 순위 지정 (정수 1~10까지 지정가능)
		th.setPriority(Thread.NORM_PRIORITY + 2); // 기본값 5 +2 하니까 7
		System.out.println("우선순위 변경: " + th.getPriority());
		
		System.out.println("1단계: " + th.getPriority()); // start() 호출하기 전이니까 NEW
		th.start();

		System.out.println("2단계: " + th.getState()); // start()했으니까 RUNNABLE
		
		
		
		try {
			Thread.sleep(130); // main에서 실행하니까 main스레드가 밀리초 멈춤
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		th.interrupt(); // 중단됨
		
		System.out.println("3단계: " + th.getState()); 	// TIMED_WAITING 
														// 콘솔창에서는 54LINE이 실행되고 있는 중에 59LINE이 먼저 실행되어 
														// 56LINE출력되고 그 후에 Exception메시지 출력
		
		
		
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 위에서 interrupt걸었으니까 TERMINATED
		System.out.println("4단계: " + th.getState());


	}

}



