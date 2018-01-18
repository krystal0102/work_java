package excercise;

// 러너블에는 생성자가 없으므로 스레드의 메소드를 이용할 수 없음! -> 스레드를 상속받을 때 보다 가벼워짐. 
// run()이라는 추상메소드만 받으면 되니까 코드를 집중적으로 활용할 수 있음
public class PrimeNumber03 implements Runnable {

	int num;
	int cnt = 0;
	String name;

	public PrimeNumber03(int num) {
		this.num = num;

	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + ":");

		for (int i = 2; i <= num; i++) {
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
