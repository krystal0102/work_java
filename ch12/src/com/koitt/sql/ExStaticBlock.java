package com.koitt.sql;

public class ExStaticBlock {
	
	static int staticNum = 20;
	int num = 10;
	
	// 이것이 static block
	static {
		System.out.println("static block 실행: " + ExStaticBlock.staticNum);
	}
	
	// instance block : 객체 생성시 무조건 생성자보다 먼저 실행되기때문에 여러 생성자의 공통적인 코드 부분을 instance block에 구현하면 편리하다
	{
		System.out.print("instance block 실행: ");
		System.out.print(ExStaticBlock.staticNum + " / ");
		System.out.println(this.num);
	}
		
	// 기본생성자
	public ExStaticBlock() {
		System.out.println("기본생성자 실행: " + this.num);
	}
	
	// 생성자
	public ExStaticBlock(String test) {
		System.out.println("ExStaticBlock(String test) 실행");
	}
	
	public static void main(String[] args) {
		try {
			// static 키워드가 붙은 항목들만 실행됨. 기본생성자XXXXXXX
			Class.forName("com.koitt.sql.ExStaticBlock");
			
			// 객체를 생성함으로써 기본생성자 호출됨
			ExStaticBlock block = new ExStaticBlock();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
