package operator;

public class BitShiftOP {

	public static void main(String[] args) {
		
		int x = 8, y = 3;
																 //������ ���ڿ��� �ٲ��ش�!
		System.out.format("%d(%s) >> %d ��� %d(%s) %n",x, Integer.toBinaryString(x),
				y, x>>3, Integer.toBinaryString(x>>3));
		// x�� 8�� �������� �ٲ������� 1000�� >>3�� �̿��� ���������� ���� �̵��ϸ� 0001(2) = 1
		
		
		System.out.format("%d(%s) << %d ��� %d(%s) %n",x, Integer.toBinaryString(x),
				y, x<<3, Integer.toBinaryString(x<<3));
		
		System.out.format("%d(%s) >>> %d ��� %d(%s) %n",x, Integer.toBinaryString(x),
				y, x>>>3, Integer.toBinaryString(x>>>3));

	}

}
