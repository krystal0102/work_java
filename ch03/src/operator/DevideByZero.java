package operator;

public class DevideByZero {

	public static void main(String[] args) {
		short data1 = 32766;
		short data2 = 1;
		//short data3 = data1 + data2; short��� ��ø� �߾ int������ ��ȯ�Ǳ� ������ ���� �߻�. ���� ����� ����ȯ�ʿ�
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		System.out.println(data3 + " " + data4);
		
		System.out.println(0.0 / 0.0); // NaN Not a Number ���ڰ��ƴϴ�! ���� ���� �����ϵ� NaN������ �����Ե�
									  // NaN�� �Ǽ��������� ������.
		System.out.println(3 / 0.0); // ���Ѵ밡 ������ ������ Infinity (3�� double������ ��ȯ�Ǽ�)
		System.out.println(3 / 0); // ������ 0���� ���� �� ���� ������ ���ܹ߻�. ����ó���� �����ϹǷ� Run�� ������
		
		String money = "NaN";
		double moneyDouble = Double.parseDouble(money);
		if (!Double.isNaN(moneyDouble)) {
			double balance = 30000;
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else {
			System.out.println("�ݾ��� �ٽ� �Է����ּ���.");
		}

	}

}
