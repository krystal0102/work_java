package excercise;
							// 반드시 예외처리가 필요할 경우 체크예외 만들기
							// 아닐경우엔 비체크예외인 RuntimeException 사용
public class InvalidWithdraw extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
