package programming.basic;

public class HelloLiterals {
	
	static long creditCardNumber = 1234_5678_9012_3456L; //Java7부터 적용. 언더바는 보기편하라고 쓴것. 광범위한 호환을 위해서 쓰지 않는걸 추천하기도함
 	static long socialSecurityNumber = 999_99_9999L; 
	static float pi = 3.14_15F;
	
	public static void main(String[] args) {
		System.out.println(0b1010);				//이진수 b는 이진수를 뜻함
		System.out.println(016);				//8진수
		System.out.println(0x1F);				//16진수
		System.out.println(3.14f);				//float형
		System.out.println(3.1415D);			//double형 - 자바에서는 기본형이 더블형이므로 D를 쓰지않아도 더블형출력
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
	}

}
