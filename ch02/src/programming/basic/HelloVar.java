package programming.basic;

public class HelloVar {
	
	public static void main(String[] args) {
		
	//���� ����
	int var01;
	
	//�ʱ�ȭ : ������ ���� �ִ°�
	var01 = 100;
	
	//���� ���� + �ʱ�ȭ
	int var02 = 100;
	
	//���� ������ ����
	int a1, b1, c1;
	a1 = 100;
	b1 = 200;
	c1 = 300;
	
	//���������� �ݵ�� �ʱ�ȭ�� �ؾ� ��� ����
	//int x,y = 3; 
	//System.out.println(x); x�� �ʱ�ȭ�ؾ� x�� �̿��� �� ����
	
	byte b = 0xA; //16���� 10
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
