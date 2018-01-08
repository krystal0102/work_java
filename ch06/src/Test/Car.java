package Test;

public class Car {
	
	int maxSpeed;
	int speed;
	
	public Car(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUP() {
		this.speed += 5;
		System.out.println("speedUP() 호출: 최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
		}
	
	public void speedUP(int speed) {
		System.out.println("speedUP(" + speed + ") 호출: ");
		if(speed < 0) {
			System.out.println("오류: 속도가 음수이므로 0으로 지정: 최대속도: " + this.maxSpeed +
								", 현재속도: "+this.speed );
		}
		else {
		this.speed += speed;
		}
	}
	
	public void speedDown() {
		this.speed -= 5;
	}
	
	public void speedDown(int speed) {
		if(speed < 0) {
			System.out.println("speedDown(" + speed + ") 호출: ");
			System.out.println("오류: 속도가 음수이므로 0으로 지정: 최대속도: " + this.maxSpeed +
								", 현재속도: "+this.speed );
		}
		else if (this.speed < 0) {
			System.out.println("속도가 0보다 작아져 0으로 지정,");
		}
		else {
			this.speed -= speed;
		}
		
		System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(300);
		myCar.speedUP();
		myCar.speedUP();
		myCar.speedUP(-50);
		myCar.speedUP(50);
		myCar.speedDown(-30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedUP(100);
		myCar.speedUP(300);
	}
	

}
