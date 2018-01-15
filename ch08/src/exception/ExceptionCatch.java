package exception;

public class ExceptionCatch {
	public static void main(String[] args) {
		int data = 0;
		
		try {
			data = Integer.parseInt("1123.45");				// java.lang.NumberFormatException 예외 발생
		}
		catch (ClassCastException e) {	// NumberFormatException과 관계가 없으므로 실행 x
			System.out.println("예외 발생 1: " + e);
			System.out.println("e.getMessage(): " + e.getMessage());
		}
		catch (Exception e) {	// 상속받고 있는 상위클래스이므로 실행o
			System.out.println("예외발생 2: " + e);
			// 예외에서 주로 이용하는 메소드 getMessage()와 printStackTrace()
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		}
		
		System.out.printf("data = %d %n", data);
		
 	}
}
