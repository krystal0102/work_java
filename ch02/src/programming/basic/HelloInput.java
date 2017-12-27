package programming.basic;

public class HelloInput {
	
	public static void main(String[] args) {
		
		//System.in은 키보드입력 스트림
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("이름과 학번을 입력하세요");
		
		//입력받은 문자열을 토큰으로 구분지어서 문자열 일부를 리턴
		String name = input.next(); //다음 토큰(띄어쓰기)까지 읽음
		int num = input.nextInt(); //다음 토큰(엔터)까지의 값을 숫자로 읽겠다
		System.out.println("이름 : " + name + ", 학번 : " + num);
	}

}
