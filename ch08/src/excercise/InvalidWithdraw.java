package excercise;
							// 반드시 예외처리가 필요할 경우 체크예외 만들기
public class InvalidWithdraw extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
