package programming.basic;
/** �ּ�
 * 
 * @author KOITT
 *
 */
public class HelloProgramming {
	
	//�ν��Ͻ� ����(Instance Variable)���� (�ʵ�,������� ��� ��)
	static String fd = " -- �ʵ�";
	static String md = " -- �޼ҵ�";
	
	//�ڹ� ���α׷��� �����ϴ� main()�޼��� ����
	public static void main(String[] args) {
		System.out.println("�ڹ� Ŭ������ ����");
		write(fd);
		write(md);
	}

	//���α׷��Ӱ� �����ϴ� write()�޼��� �� ����
	public static void write(String word) {
		System.out.println(word);
	}
}
