package com.koitt.java.exception02;

public class MyException extends Exception {
	
	// Exception 만들기
	public MyException(String msg) {
		super(msg);	// getMessage() 호출 시 출력되는 메시지
 	}
}
