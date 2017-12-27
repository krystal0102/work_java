package programming.basic;
/** 주석
 * 
 * @author KOITT
 *
 */
public class HelloProgramming {
	
	//인스턴스 변수(Instance Variable)선언 (필드,멤버변수 라고도 함)
	static String fd = " -- 필드";
	static String md = " -- 메소드";
	
	//자바 프로그램을 실행하는 main()메서드 구현
	public static void main(String[] args) {
		System.out.println("자바 클래스의 구조");
		write(fd);
		write(md);
	}

	//프로그래머가 정의하는 write()메서드 의 구현
	public static void write(String word) {
		System.out.println(word);
	}
}
