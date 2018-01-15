package exception;

public class ExceptionType1 {
	static int num[];
	
	public static void main(String[] args) {
		System.out.println(num.length);	// 초기화를 하지 않았으므로 num은 null 
										// length는 int값이라 null값을 가질 수 없는데 접근하려 했으므로 exception발생
	}

}
