package exception;

public class ExceptionType2 {
	public static void main(String[] args) {
		
		String str[] = {"안녕하세요!", "Hello!"};
		
		System.out.println(str[0]);
		System.out.println(str[2]);			// 예외발생 : 배열의 index번호가 범위를 벗어남
		System.out.println(str[1]);
 	}

}
