package programming.basic;

public class HelloChars {
	
	public static void main(String[] args) {
		
		System.out.println('a');		//일반문자 - char형
		System.out.println('\\');		//특수문자 - '\'를 써서 \출력
		System.out.println('\142');		//코드값 8진수 표현 - 10진수로는 98-> ASCII코드값에 따라 b출력
		System.out.println('\uAC00');	//UTF-8(Unicode)값 AC00 : 가
		System.out.println('\uAC01');	//Unicode값 AC01 : 각
		System.out.println('강');		//일반문자
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\nDEF"); 
		System.out.println("\'");
	}

}
