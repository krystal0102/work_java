package programming.basic;

public class HelloLiterals {
	
	static long creditCardNumber = 1234_5678_9012_3456L; //Java7���� ����. ����ٴ� �������϶�� ����. �������� ȣȯ�� ���ؼ� ���� �ʴ°� ��õ�ϱ⵵��
 	static long socialSecurityNumber = 999_99_9999L; 
	static float pi = 3.14_15F;
	
	public static void main(String[] args) {
		System.out.println(0b1010);				//������ b�� �������� ����
		System.out.println(016);				//8����
		System.out.println(0x1F);				//16����
		System.out.println(3.14f);				//float��
		System.out.println(3.1415D);			//double�� - �ڹٿ����� �⺻���� �������̹Ƿ� D�� �����ʾƵ� ���������
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
	}

}
