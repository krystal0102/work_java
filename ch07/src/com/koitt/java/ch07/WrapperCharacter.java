package com.koitt.java.ch07;

public class WrapperCharacter {
	public static void main(String[] args) {
		//Character ch = new Character('@');
		Character ch = '@';										// boxing
		Character ch2 = '@';
		
		System.out.print(ch + " ");								// unboxing : 호출을 하지 않더라도 컴파일러가 자동으로 변환해주는것
		System.out.print(ch.charValue()+ " ");					// 두 값을 비교하여 뺀 수를 출력
		System.out.println(ch.toString());						// 리턴되는 타입은 다르지만 결과는 같음 (String 과 char)
		System.out.print(ch.compareTo('@') + " ");				// 두값을 비교해서 다른곳의 갯수를 표시함
		System.out.println(ch.hashCode());
		System.out.println(ch2.hashCode());
		System.out.println();
		
		// 정적메소드 
		System.out.print(Character.toUpperCase('d') + " ");		// 대문자로 바꿔줌
		System.out.println(Character.toLowerCase('F'));			// 소문자로 바꿔줌
		System.out.print(Character.getName('@') + ", ");		// 문자의 명칭을 알고 싶을떄
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");
		System.out.println(Character.isDigit('5'));
	}

}
