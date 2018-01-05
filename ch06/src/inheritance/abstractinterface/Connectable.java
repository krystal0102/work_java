package inheritance.abstractinterface;

public interface Connectable {
	
	// 컴파일러는 무조건 public abstract 키워드를 붙임 : 어차피 인터페이스는 공개적이어야 하고 추상적이기 때문에
	public static final String name = "연결방법: USB"; // 스태틱 상수를 선언하여 네임은 변하지 않는 값이 됨
	
	public abstract void connect();

}
