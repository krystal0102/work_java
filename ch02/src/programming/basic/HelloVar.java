package programming.basic;

public class HelloVar {
	
	public static void main(String[] args) {
		
	//변수 선언
	int var01;
	
	//초기화 : 변수에 값을 넣는것
	var01 = 100;
	
	//변수 선언 + 초기화
	int var02 = 100;
	
	//여러 변수의 선언
	int a1, b1, c1;
	a1 = 100;
	b1 = 200;
	c1 = 300;
	
	//지역변수는 반드시 초기화를 해야 사용 가능
	//int x,y = 3; 
	//System.out.println(x); x를 초기화해야 x값 이용할 수 있음
	
	byte b = 0xA; //16진수 10
	short s = 32767; 
	long distance = 1500_00_000000L;
	double d = 1500E8D; //1.5*10^11
	int x,y = 10, z = 20;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(distance);
	System.out.println(d);
	System.out.println(y);
	System.out.println(z);

	}
}
