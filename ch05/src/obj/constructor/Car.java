package obj.constructor;

public class Car {
	
	private int maxSpeed;
	public String brandName;
	public int speed;
	
	public Car(String brandName) {
		this.brandName = brandName;
	}
	
	public Car (String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	// 속도 관련 메소드
	public int speedUp() {
		int tempSpeed = this.speed; 
		tempSpeed += 30;
		
		// 최대 속도보다 더 높다면 이전 속도 유지
		if (tempSpeed > this.maxSpeed) {
			return this.speed;
		}
		
		// 최대 속도보다 같거나 작다면 현재 속도를 갱신
		this.speed = tempSpeed; // 더한 결과를 대입
		return this.speed;
	}
	
	public int speedDown() {
		// 속도가 마이너스 값이 될 수 없기 때문에 체크하는 장치 만들기
		
		// 현재속도를 임시로 저장
		int tempSpeed = this.speed;
		tempSpeed -= 20;
		
		// 현재속도가 0보다 작다면
		if (tempSpeed < 0) {
			return 0;
		}
		
		// 현재속도를 계산한 속도로 갱신
		this.speed = tempSpeed;
		return this.speed;
	}
	
	// maxSpeed의 getter와 setter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {

		Car mycar = new Car("포르쉐", 300);
		mycar.speedUp();
		mycar.speedUp();
		System.out.print("차종: " + mycar.brandName);
		System.out.print(", 최고속도: " + mycar.getMaxSpeed());
		System.out.println(", 현재속도: " + mycar.speedDown());

	}

}
