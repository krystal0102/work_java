package obj.field;

public class CreditCard {
	
	/* 접근제한자
	 * - private : 같은 클래스 내에서만 사용 가능
	 * - (default) : 같은 패키지 내에서만 사용 가능
	 * - protected : default 범위 + 상속받은 클래스까지 사용 가능
	 * - public : 어디든 사용 가능
	 * 
	 */

	private long number;
	public String owner;
	
	public static void main(String[] args) {
		
		// 멤버 변수를 사용하기 전 객체를 만들어줌
		CreditCard myCard = new CreditCard();
		
		// 클래스의 필드는 자동으로 기본값으로 초기화된다.
		// 단, 지역변수 (Loccal Variable)는 수동으로 기본값을 초기화 해야된다.
		System.out.println("기본값 : " + myCard.number + ", " + myCard.owner);
		
		
		/* 지역변수는 수동으로 기본값을 초기화 해야한다.
		 * String local; // 지역변수 선언만 하고 초기화를 하지 않은 경우
		   System.out.println(local);*/
		
		// 라는 변수는 
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "유 재석";
		System.out.print("카드번호 : " + myCard.number);
		System.out.print(", 카드소유자 : " + myCard.owner);

	}

}
