package excercise;

import java.util.Date;

public class PrintTime implements Runnable {

	private int num;

	public PrintTime (int num) {
		this.num = num;
	}

	@Override
	public void run() {

		for (int i = 1; i <= this.num; i ++) {
			try {
				Thread.sleep(3000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + new Date()
					+ " " + Thread.currentThread().getName());
		}
	}
}
