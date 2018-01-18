package excercise;

public class PrimeNumber01 extends Thread {
	
	int num;
	int cnt;
	
	public PrimeNumber01(int num) {
		this.num = num;
	}

	public void run() {

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
