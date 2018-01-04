package inheritance.constructor;

public class Vehicle {
	
	private String name = "차량";		// 이름
	private double maxSpeed;			// 최대속도
	private int seater;				// 정원
	
	// 부모 클래스에서는 항상 기본생성자를 만들어야함~ ( 사용하지 않더라도 언제든 쓸 수 있게)
	public Vehicle() {
		
	}
	
	public Vehicle(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
	
	

}
