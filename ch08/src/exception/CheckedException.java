package exception;

public class CheckedException {
	public static void main(String[] args) {
		// 메소드 Class.fonName()을 사용하려면 반드시 예외처리를 해야함
		Class<?> forName = null;
		// ? : 어떤 타입이 들어올 지 모를때 사용
		try {
			forName = Class.forName("java.lang.Object");		// 컴파일 오류 : 체크예외 -> 반드시 예외처리를 해야하는 예외
						// forName : ()안 내용의 이름을 가지는 클래스 타입이 있는지 찾아줌
		} 
		catch (ClassNotFoundException e) {
			/*자동 완성의 폐해 : printStackTrace()는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에 프로그램 배포시에는 꼭 막아야 한다.
							Debug용으로만 제발!!! 사용 바랍니다.*/
			e.printStackTrace();
		} 
		
		
		
		System.out.println(forName);
	}	
}
