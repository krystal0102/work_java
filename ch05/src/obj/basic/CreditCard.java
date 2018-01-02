package obj.basic;

public class CreditCard {

	private long number;
	public String owner;
	private int point;
	private int balance;
	
	// 카드 사용 메소드
	public void use(int amount) {
		this.balance += amount; // this 가 빠지면 필드인지 지역변수인지 헷갈림. 또한 붙이지 않을 경우 컴파일러가 모든 변수에 필드라 인식하고 this를 붙임
		System.out.println("현재 카드 사용액 : " + balance);
	}
	
	// 카드 비용 지불 메소드
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액 : " + amount + ", 지불잔액 : " + balance);
		addPoint(amount);
	}
	
	// 카드 포인트 추가 메소드
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("보너스 포인트 : " + point);
	}
	
	public static void main(String[] args) {
		
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수강";
		System.out.print("카드번호 : " + myCard.number);
		System.out.println(", 카드소유자 : " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.use(50000);

	}

}
