package test;

public class Computer {
	
	public final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	
	private int indexOfos; //osType의 인덱스
	private int memory;		// 메모리의 크기
	
	// 생성자
	public Computer(int indexOfos, int memory) {
		this.indexOfos = indexOfos;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("운영체제: " + osType[this.indexOfos] + ", 메인메모리: " + this.memory);
	}
	
	public static void main(String[] args) {
		
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();
		

		
	}
	
	
}