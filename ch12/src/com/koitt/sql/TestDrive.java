package com.koitt.sql;

public class TestDrive {
	
	static {
		// TestDrive 클래슨 main메소드를 포함하고 있는데 Java가상머신(VM)이 main실행을 위해
		// TestDrive 클래스 정보를 메모리에 올려야 하기 때문에 static block이 실행
		
		System.out.println("TestDrive static block 실행....!");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		/*Class.forName("com.koitt.sql.ExStaticBlock");
		new ExStaticBlock();*/
		new ExStaticBlock();
		new ExStaticBlock(); // static block은 정보를 메모리에 올리기 위해 실행되기 때문에 한번 실행된 후에 또 실행되지 않음
		new ExStaticBlock("테스트");
		
	}

}
