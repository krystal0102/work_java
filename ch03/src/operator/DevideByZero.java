package operator;

public class DevideByZero {

	public static void main(String[] args) {
		short data1 = 32766;
		short data2 = 1;
		//short data3 = data1 + data2; short라고 명시를 했어도 int형으로 변환되기 때문에 오류 발생. 따라서 명시적 형변환필요
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		System.out.println(data3 + " " + data4);
		
		System.out.println(0.0 / 0.0); // NaN Not a Number 숫자가아니다! 무슨 수를 연산하든 NaN값으로 나오게됨
									  // NaN은 실수형에서만 존재함.
		System.out.println(3 / 0.0); // 무한대가 나오기 때문에 Infinity (3이 double형으로 변환되서)
		System.out.println(3 / 0); // 정수를 0으로 나눌 수 없기 때문에 예외발생. 예외처리가 가능하므로 Run은 가능함
		
		String money = "NaN";
		double moneyDouble = Double.parseDouble(money);
		if (!Double.isNaN(moneyDouble)) {
			double balance = 30000;
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else {
			System.out.println("금액을 다시 입력해주세요.");
		}

	}

}
