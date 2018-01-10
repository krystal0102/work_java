package enumeration;

public class EnumTest {
	public enum pl {c, cpp, java, csharp};
		//클래스 기반으로 만든 타입
	
	public int[] a = {10, 20, 30, 40, 50};
	
	public static void main(String[] args) {
		pl clang = pl.c;				// 정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang);		// 저장된 상수 문자열이 출력
		
		clang = pl.csharp;
		
		switch(clang) {
			case csharp:
				System.out.println(clang + ": c# 언어 ");
		}
		
		for (pl p: pl.values()) {
			System.out.print(p + " ");
		}
		System.out.println();
		
		// non-static 오류 발생시, 위의 int[] a를 static으로 선언하던가 객체를 만들던가
		EnumTest t = new EnumTest();
		for (int item : t.a) {
			System.out.println(item);
		}
	}

}
