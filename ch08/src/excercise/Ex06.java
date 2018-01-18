package excercise;

public class Ex06 {
	public static void main(String[] args) {
		
		// 이거는 정답이긴 하지만 가독성이 떨어지니까 수정
		// new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();
		
		Runnable pn = new PrimeNumber03(25);
		
		// 스레드한테는 public Thread(Runnable target, String name) {} 메소드가 있어 저렇게 써서 구현할 수 있다
   
		Thread th = new Thread(pn, "소수 만드는 스레드");
		
	}

}
