package programming.basic;

public class HelloChars {
	
	public static void main(String[] args) {
		
		System.out.println('a');		//�Ϲݹ��� - char��
		System.out.println('\\');		//Ư������ - '\'�� �Ἥ \���
		System.out.println('\142');		//�ڵ尪 8���� ǥ�� - 10�����δ� 98-> ASCII�ڵ尪�� ���� b���
		System.out.println('\uAC00');	//UTF-8(Unicode)�� AC00 : ��
		System.out.println('\uAC01');	//Unicode�� AC01 : ��
		System.out.println('��');		//�Ϲݹ���
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\nDEF"); 
		System.out.println("\'");
	}

}
