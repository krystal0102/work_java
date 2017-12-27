package programming.basic;

public class HelloPrintf {

	public static void main(String[] args) {
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/* d : Decimal 10����
		 * O : Octal 8����
		 * h,x,H : Hexadecimal 16����
		 * 1$ : ������ �ڸ����� ����Ŵ. 1$�� ù��° ����~~~
		 */
		System.out.format("%6d %6o %6h %n", 10,10,10); // 6ĭ�� �����ϰڴ�
		System.out.format("%-6d %-6o %-6x %n", 20, 20, 20); //-���̸� ��������
		System.out.format("%+6d %6o %6H %n", 30, 30, 30); // ������ ���̱� ex> +,-
		System.out.format("%1$6d %1$6o %1$6h %n",128);
		
		//.a �� �Ҽ��� ���°�ڸ����� ��Ÿ������ ǥ���ϰ�, �ݿø��ؼ� ��Ÿ����
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.141592);
		

	}

}
