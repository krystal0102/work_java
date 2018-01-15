package exception;

public class ExceptionHandling {
	static int num[];
	
	public static void main(String[] args) {
		String str[] = {"안녕하세요!", "Hello!"};
		
		try {
			System.out.println(str[0]);
			System.out.println(num.length);					// 예외발생
			System.out.println(str[2]);						// 위에서 예외가 발생하여 이 문장은 실행x
		}
		catch(Exception e) {								// 클래스 NullPointerException은 클래스 Exception을 상속받고 있음
			System.out.println("예외 발생: " + e);			// catch(NullPointerException e) 와 같이 명시적으로 쓸 수도 있으나
							//("예외 발생: " + e.toString()); // NullPointerException 외의 다른 exception 발생 시 실행할 수 없다 
							// 객체e를 넣어서 문장을 출력하므로 메소드 toString을 사용한 문장임
			System.out.println("예외 발생 메시지: " + e.getMessage()); // 예외 발생 메세지를 입력하지 않았으므로 null이 출력됨
			e.printStackTrace();							// void타입. 예외 처리를 하지 않은 경우 출력되는 모든 메시지
		}
		finally {
			System.out.println("try 실행");
		}
		
		System.out.println("프로그램이 정상적으로 종료됩니다.");
	}
}
