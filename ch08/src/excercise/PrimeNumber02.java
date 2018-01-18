package excercise;

public class PrimeNumber02 extends Thread {

	int num;
	int cnt;
	String name;

	public PrimeNumber02 (int num, String name) {
		
		// super(name); // 부모의 생성자를 이용하여 스레드 이름 변경 -> 무조건 첫줄에 와야함
		this.setName(name);	//setter를 이용해 스레드 이름 변경 -> 일반 메소드
		this.num = num;	
	
	}
	
	public void run() {

		System.out.println(Thread.currentThread().getName() + ":");

		for (int i = 2; i <= num; i++) {
			cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			if (cnt == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
